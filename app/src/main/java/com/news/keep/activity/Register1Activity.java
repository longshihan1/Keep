package com.news.keep.activity;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.Message;
import android.provider.MediaStore;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.news.keep.R;
import com.news.keep.bean.People;
import com.news.keep.utils.Constans;
import com.news.keep.utils.Design;
import com.news.keep.utils.TLUtil;
import com.news.keep.view.PickerView;
import com.news.keep.view.PlayMoreDiaolog;
import com.news.keep.view.RoundImageView;
import com.news.keep.view.TopBar;
import com.news.keep.view.interfaces.TopBarClickListener;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;
import cn.bmob.v3.Bmob;
import cn.bmob.v3.datatype.BmobFile;
import cn.bmob.v3.listener.SaveListener;
import cn.bmob.v3.listener.UpdateListener;
import cn.bmob.v3.listener.UploadFileListener;

public class Register1Activity extends AppCompatActivity {
    @InjectView(R.id.register_nick_edt_txt)
    TextInputLayout registerNickEdtTxt;
    @InjectView(R.id.register_psd_edt_txt)
    TextInputLayout registerPsdEdtTxt;
    @InjectView(R.id.register_psd_re_edt_txt)
    TextInputLayout registerPsdReEdtTxt;

    private String TAG = "Register1Activity";

    @InjectView(R.id.register_topBar)
    TopBar registerTopBar;
    @InjectView(R.id.register_photo)
    RoundImageView registerPhoto;
    @InjectView(R.id.register_nick_edt)
    EditText registerNickEdt;
    @InjectView(R.id.register_psd_edt)
    EditText registerPsdEdt;
    @InjectView(R.id.register_psd_re_edt)
    EditText registerPsdReEdt;
    @InjectView(R.id.register_high)
    TextView registerHigh;
    @InjectView(R.id.register_picker_high)
    PickerView registerPickerHigh;
    @InjectView(R.id.register_weight)
    TextView registerWeight;
    @InjectView(R.id.register_picker_weight)
    PickerView registerPickerWeight;
    @InjectView(R.id.register_age)
    TextView registerAge;
    @InjectView(R.id.register_picker_age)
    PickerView registerPickerAge;
    @InjectView(R.id.register_sex)
    TextView registerSex;
    @InjectView(R.id.register_picker_sex)
    PickerView registerPickerSex;
    private String phone;
    private boolean is_takephoto;
    private String user_img;


    /*用来标识请求照相功能的activity*/
    private static final int CAMERA_WITH_DATA = 3023;

    /*用来标识请求gallery的activity*/
    private static final int PHOTO_PICKED_WITH_DATA = 3021;

    /*拍照的照片存储位置*/
    private static final File PHOTO_DIR = new File(Environment.getExternalStorageDirectory() + "/DCIM/Camera");

    private File mCurrentPhotoFile;//照相机拍照得到的图片

    private PlayMoreDiaolog mPlayMoreDiaolog;
    private Bitmap upload_bitmap;
    public static final String IMAGE_UNSPECIFIED = "image/*";
    public static final String CACHE_DIR = "/train/" + "images/";
    private static final int IMAGE_FROM_CAMERA = 0x0a1;
    private static final int IMAGE_FROM_PHOTOS = 0xfe2;
    public static final int PHOTORESOULT = 0xaf3;// 结果


    private String hight_pv;//身高
    private String weight_pv;//体重
    private String age_pv;//年龄
    private String sex_pv;//性别
    private String nick_name;
    private String password;
    private String password_re;

    private List<String> height;
    private List<String> weight;
    private List<String> age;
    private List<String> sex;

    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.login_person);
        ButterKnife.inject(this);
        // 初始化 Bmob SDK
        Bmob.initialize(getApplicationContext(), Constans.Bmob_APPID);
        context = this;
        is_takephoto = false;

        Intent intent = getIntent();
        phone = intent.getStringExtra("phone");
        Log.e(TAG, phone);

        initView();
        initData();
        initListener();
    }

    Handler handler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            int what = msg.what;
            if (what == 1) {
                Log.e(TAG, "跳转");
                String user_id = msg.obj.toString();
                People people = new People();
                people.update(getApplicationContext(), user_id, new UpdateListener() {
                    @Override
                    public void onSuccess() {

                        Intent intent = new Intent(Register1Activity.this, MainActivity.class);
                        startActivity(intent);
                        Register1Activity.this.finish();

                    }

                    @Override
                    public void onFailure(int i, String s) {
                        Log.e(TAG, s + ":" + i);
                    }
                });
            }
        }
    };

    private void initView() {
        height = new ArrayList<String>();
        weight = new ArrayList<String>();
        age = new ArrayList<String>();
        sex = new ArrayList<String>();

        for (int i = 100; i < 265; i++) {
            height.add(i + "");
        }
        for (int i = 50; i < 150; i++) {
            weight.add(i + "");
        }
        for (int i = 10; i < 80; i++) {
            age.add("" + i);
        }
        sex.add("男");
        sex.add("女");


    }

    private void initData() {
        registerPickerHigh.setData(height);
        registerPickerWeight.setData(weight);
        registerPickerAge.setData(age);
        registerPickerSex.setData(sex);

    }

    private void initListener() {


        registerPickerHigh.setOnSelectListener(new PickerView.onSelectListener() {

            @Override
            public void onSelect(String text) {
                hight_pv = text;
            }
        });
        registerPickerWeight.setOnSelectListener(new PickerView.onSelectListener() {

            @Override
            public void onSelect(String text) {
                weight_pv = text;
            }
        });
        registerPickerAge.setOnSelectListener(new PickerView.onSelectListener() {

            @Override
            public void onSelect(String text) {
                age_pv = text;
            }
        });
        registerPickerSex.setOnSelectListener(new PickerView.onSelectListener() {

            @Override
            public void onSelect(String text) {
                sex_pv = text;
            }
        });

        //用.getEditText()拿到TextInputLayout里的EditText，因为TextInputLayout中有getEditText()方法，所以我们不需要findViewById，用get就行。
        registerPsdEdtTxt.getEditText().addTextChangedListener(new Design(registerPsdEdtTxt, "密码长度不能小于6位或大于10"));

        registerPsdReEdtTxt.getEditText().addTextChangedListener(new Design(registerPsdReEdtTxt, "密码长度不能小于6位或大于10"));

        //注册事件
        registerTopBar.setTopBarClickListener(new TopBarClickListener() {
            @Override
            public void rightBtnClick() {
                //处理右边按钮所对应的逻辑
                password_re = registerPsdReEdt.getText().toString();
                password = registerPsdEdt.getText().toString();
                nick_name = registerNickEdt.getText().toString();
                System.out.println(password_re+":"+password+":"+nick_name+"sss");
                if (!password.equals(password_re)) {
                    registerPsdReEdtTxt.setError("两次密码不正确");
                    return;
                }
                //123asd

                new AlertDialog.Builder(context)
                        .setTitle("确认注册")
                        .setMessage("是否确认开启健康世界？")
                        .setPositiveButton("是", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                final People user = new People();
                                user.setMobilePhoneNumber(phone);
                                user.setUsername(nick_name);
                                user.setPassword(password);
                                user.setPeoage(age_pv);
                                user.setPeogender(sex_pv);
                                user.setPeoheight(hight_pv);
                                user.setPeoweight(weight_pv);
                                user.setPeoimg(user_img);
                                user.signUp(context, new SaveListener() {

                                    @Override
                                    public void onSuccess() {
                                        Message message = Message.obtain();
                                        message.what = 1;
                                        message.obj = user.getObjectId();
                                        handler.sendMessage(message);
                                    }

                                    @Override
                                    public void onFailure(int code, String arg0) {
                                        // 添加失败
                                        System.out.println(arg0 + ":" + code);
                                    }
                                });

                            }
                        })
                        .setNegativeButton("否", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.dismiss();

                            }
                        })
                        .show();


            }

            @Override
            public void leftBtnClick() {
                //处理左边按钮所对应的逻辑
                Intent intent = new Intent(Register1Activity.this, Splash1Activity.class);
                startActivity(intent);
                finish();


            }
        });


    }

    @OnClick(R.id.register_photo)
    public void onClick() {
        showSelectDialog();
    }

    private void showSelectDialog() {
        List<String> mTitles = new ArrayList<String>();
        mTitles.add("从相册选择");
        mTitles.add("拍照");
        if (mPlayMoreDiaolog == null) {
            mPlayMoreDiaolog = new PlayMoreDiaolog(
                    Register1Activity.this, mTitles);
        } else {
            mPlayMoreDiaolog.setmTitles(mTitles);
        }
        mPlayMoreDiaolog.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> adapterView, View view,
                                    int position, long id) {
                switch (position) {
                    case 1:
                        String status = Environment.getExternalStorageState();
                        if (status.equals(Environment.MEDIA_MOUNTED)) {
                            getFromCamera();// 从相机获取
                        } else {
                            // 没有SD卡;
                            TLUtil.showToast(context, "手机没有SD卡");
                        }
                        break;
                    case 0:
                        getFromPhotos();// 从相相册获取
                        break;
                }
                mPlayMoreDiaolog.dismiss();
                mPlayMoreDiaolog = null;
            }
        });
        mPlayMoreDiaolog.show();
    }

    // 相机拍照
    private void getFromCamera() {
        try {
            Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
            intent.putExtra(MediaStore.EXTRA_OUTPUT,
                    Uri.fromFile(getTempHeadFile()));
            startActivityForResult(intent, IMAGE_FROM_CAMERA);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 从相册选择
    private void getFromPhotos() {
        Intent intent = new Intent(Intent.ACTION_PICK, null);
        intent.setDataAndType(MediaStore.Images.Media.EXTERNAL_CONTENT_URI,
                IMAGE_UNSPECIFIED);
        startActivityForResult(intent, IMAGE_FROM_PHOTOS);

    }

    // 剪裁图片
    public void startPhotoZoom(Uri uri) {
        Intent intent = new Intent("com.android.camera.action.CROP");
        intent.setDataAndType(uri, IMAGE_UNSPECIFIED);
        intent.putExtra("crop", "true");
        // aspectX aspectY 是宽高的比例
        intent.putExtra("aspectX", 1);
        intent.putExtra("aspectY", 1);
        // outputX outputY 是裁剪图片宽高
        intent.putExtra("outputX", 130);
        intent.putExtra("outputY", 130);
        intent.putExtra("scale", true);
        Uri imageUri = Uri.fromFile(getTempHeadFile());
        intent.putExtra(MediaStore.EXTRA_OUTPUT, imageUri);
        intent.putExtra("return-data", false);
        intent.putExtra("outputFormat", Bitmap.CompressFormat.JPEG.toString());
        intent.putExtra("noFaceDetection", true);
        try {
            startActivityForResult(intent, PHOTORESOULT);
        } catch (Exception e) {
        }
    }

    // 获取图片的路径
    private File getTempHeadFile() {
        File f = null;
        File head = null;
        if (Environment.getExternalStorageState().equals(
                Environment.MEDIA_MOUNTED))
            f = new File(Environment.getExternalStorageDirectory(),
                    CACHE_DIR);
        else
            f = getCacheDir();

        if (!f.exists())
            f.mkdirs();
        else {
            if (f.isFile()) {
                f.deleteOnExit();
                f.mkdirs();
            }
        }
        head = new File(f, "myhead.jpg");
        if (!head.exists()) {
            try {
                head.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        f = null;
        return head;
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        switch (requestCode) {
            //从相机获取到了照片路径
            case IMAGE_FROM_CAMERA:
                if (resultCode == Activity.RESULT_OK) {
                    startPhotoZoom(Uri.fromFile(getTempHeadFile()));
                }
                break;
            //从相册获取到了照片路径
            case IMAGE_FROM_PHOTOS:
                if (resultCode == Activity.RESULT_OK) {
                    startPhotoZoom(data.getData());
                }
                break;
            //拿到了图片结果
            case PHOTORESOULT:
                if (resultCode == Activity.RESULT_OK) {

                    upload_bitmap = BitmapFactory.decodeFile(getTempHeadFile().getPath());
                    Log.e(TAG, getTempHeadFile().getPath());

                    if (upload_bitmap == null)
                        return;

                    String picPath = getTempHeadFile().getPath();
                    final BmobFile bmobFile = new BmobFile(new File(picPath));
                    bmobFile.uploadblock(context, new UploadFileListener() {

                        @Override
                        public void onSuccess() {
                            // TODO Auto-generated method stub
                            //bmobFile.getUrl()---返回的上传文件的地址（不带域名）
                            //bmobFile.getFileUrl(context)--返回的上传文件的完整地址（带域名）
                            is_takephoto = true;//设置头像
                            user_img = bmobFile.getFileUrl(context);
                            System.out.println(user_img + ":" + TAG);
                        }

                        @Override
                        public void onProgress(Integer value) {
                            // 返回的上传进度（百分比）
                        }

                        @Override
                        public void onFailure(int code, String msg) {
                            Toast.makeText(Register1Activity.this, "头像上传失败", Toast.LENGTH_SHORT).show();
                        }
                    });
                    registerPhoto.setImageBitmap(upload_bitmap);
                }
                break;
        }
    }

}
