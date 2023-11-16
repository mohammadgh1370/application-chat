package com.buytick.chatapplication.Utils;

import android.content.Context;
import android.support.design.widget.TextInputEditText;
import android.util.AttributeSet;


public class PersianEditText extends TextInputEditText {

    public PersianEditText(Context context) {
        super(context);
    }

    public PersianEditText(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public PersianEditText(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    public void setText(CharSequence text, BufferType type) {
        if (text != null)
            text = FormatHelper.toPersianNumber(text.toString());
        super.setText(text, type);
    }
}
