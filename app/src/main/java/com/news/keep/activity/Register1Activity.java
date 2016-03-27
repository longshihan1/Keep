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
import android.provider.MediaStore;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.news.keep.R;
import com.news.keep.dao.User;
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
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;
import cn.bmob.v3.datatype.BmobFile;
import cn.bmob.v3.listener.SaveListener;
import cn.bmob.v3.listener.UploadFileListener;

public class Register1Activity extends AppCompatActivity {
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
        setContentView(R.layout.login_person);
        ButterKnife.inject(this);
        context = this;
        is_takephoto = false;

        Intent intent = getIntent();
        phone = intent.getStringExtra("phone");

        initView();
        initData();
        initListener();
    }


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
        registerPsdEdt.setOnFocusChangeListener(new android.view.View.OnFocusChangeListener() {
            public void onFocusChange(View v, boolean hasFocus) {
                if (hasFocus) {
                    // 此处为得到焦点时的处理内容
                    // Toast.makeText(Register1Activity.this, "请输入6位数密码，数字和字母组合", Toast.LENGTH_SHORT).show();
                } else {
                    // 此处为失去焦点时的处理内容
                    password = registerPsdEdt.getText().toString();
                    Pattern p = Pattern.compile("^(?![0-9]+$)(?![a-zA-Z]+$)[0-9A-Za-z]{6,10}$");
                    Matcher m = p.matcher(password);
                    if (!m.matches()) {
                        registerPsdEdt.setText("");
                        Toast.makeText(Register1Activity.this, "请输入6-10位数密码，数字和字母组合", Toast.LENGTH_SHORT).show();
                    }

                }
            }
        });
        registerPsdReEdt.setOnFocusChangeListener(new android.view.View.OnFocusChangeListener() {
            public void onFocusChange(View v, boolean hasFocus) {
                if (hasFocus) {
                    // 此处为得到焦点时的处理内容
                } else {
                    // 此处为失去焦点时的处理内容
                    password = registerPsdEdt.getText().toString();
                    password_re = registerPsdReEdt.getText().toString();
                    if (!password.equals(password_re)) {
                        Toast.makeText(Register1Activity.this, "请正确重复输入密码", Toast.LENGTH_SHORT).show();
                        registerPsdReEdt.setText("");

                    }

                }
            }
        });

        nick_name = registerNickEdt.getText().toString();
        registerTopBar.setTopBarClickListener(new TopBarClickListener() {
            @Override
            public void rightBtnClick() {
                //处理右边按钮所对应的逻辑

                new AlertDialog.Builder(context)
                        .setTitle("确认注册")
                        .setMessage("是否确认开启健康世界？")
                        .setPositiveButton("是", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                User user = new User();
                                //注意：不能调用user.setObjectId("")方法
                                user.setUsername(nick_name);
                                user.setMobilePhoneNumber(phone);
                                user.setAge(age_pv);
                                user.setGender(sex_pv);
                                user.setHeight(hight_pv);
                                user.setWeight(weight_pv);
                                user.setPassword(password_re);

                                user.save(context, new SaveListener() {

                                    @Override
                                    public void onSuccess() {
                                        //  toast("添加数据成功，返回objectId为："+gameScore.getObjectId() + ”,数据在服务端的创建时间为：“ + gameScore.getCreatedAt());
                                    }

                                    @Override
                                    public void onFailure(int code, String arg0) {
                                        // 添加失败
                                    }
                                });


                            }
                        })
                        .setNegativeButton("否", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

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
        if (android.os.Environment.getExternalStorageState().equals(
                android.os.Environment.MEDIA_MOUNTED))
            f = new File(android.os.Environment.getExternalStorageDirectory(),
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
//		拿到了图片结果
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
                            Log.e(TAG, bmobFile.getFileUrl(context));
                            user_img = bmobFile.getFileUrl(context);
                        }

                        @Override
                        public void onProgress(Integer value) {
                            // TODO Auto-generated method stub
                            // 返回的上传进度（百分比）
                        }

                        @Override
                        public void onFailure(int code, String msg) {
                            // TODO Auto-generated method stub
                            Log.e(TAG, code + ":" + msg);
                            Toast.makeText(Register1Activity.this, "头像上传失败", Toast.LENGTH_SHORT).show();
                        }
                    });
                    registerPhoto.setImageBitmap(upload_bitmap);
                }
                break;
        }
    }

}