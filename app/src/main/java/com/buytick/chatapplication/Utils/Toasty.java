package com.buytick.chatapplication.Utils;

import android.content.Context;
import android.graphics.Typeface;
import android.support.v4.content.res.ResourcesCompat;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.buytick.chatapplication.R;

public class Toasty {

    private Context context;
    private View layout;
    private TextView text;
    private Toast toast;

    public Toasty(Context context,View view) {
        this.context = context;
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        Typeface typeface = ResourcesCompat.getFont(context, R.font.iranian_sans);
        layout = inflater.inflate(R.layout.custom_toast_content, (ViewGroup) view.findViewById(R.id.toast_root));
        text = (TextView) layout.findViewById(R.id.toast_error);
        text.setTypeface(typeface);
        toast = new Toast(context);
        toast.setGravity(Gravity.BOTTOM | Gravity.FILL_HORIZONTAL, 0, 0);
        toast.setDuration(Toast.LENGTH_SHORT);
    }

    public void success(String Message){
        text.setText(Message);
        layout.setBackgroundResource(R.color.success);
        text.setCompoundDrawablesWithIntrinsicBounds(0, 0,R.drawable.ic_check_white_24dp, 0);
        toast.setView(layout);
        toast.show();
    }

    public void danger(String Message){
        text.setText(Message);
        layout.setBackgroundResource(R.color.danger);
        text.setCompoundDrawablesWithIntrinsicBounds(0, 0,R.drawable.ic_close_white_24dp,  0);
        toast.setView(layout);
        toast.show();
    }

}
