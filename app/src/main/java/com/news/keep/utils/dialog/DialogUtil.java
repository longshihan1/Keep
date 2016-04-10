package com.news.keep.utils.dialog;

import android.content.Context;

/**
 * Created by Administrator on 2016/4/3.
 * 项目名称：Keep
 * 类描述：弹框刷新
 * 创建人：Administrator
 * 创建时间：2016/4/3 15:35
 * 修改人：Administrator
 * 修改时间：2016/4/3 15:35
 * 修改备注：
 */
public class DialogUtil {
    private static LoadingDialog dialog;

    public static void show(final Context context, final String msg,
                            boolean showModal) {

        if (dialog != null && dialog.isShowing()) {
            dialog.dismiss();
        }

        dialog = new LoadingDialog(context);
        // dialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
        dialog.setCancelable(true);
        dialog.setTitle(msg);
        dialog.show();
    }

    public static void dismiss() {

        if (dialog != null) {
            dialog.dismiss();
        }
    }

}
