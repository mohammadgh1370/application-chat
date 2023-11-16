package com.buytick.chatapplication.Utils;

import android.content.Context;
import android.util.AttributeSet;

public class PersianTextView extends android.support.v7.widget.AppCompatTextView {
    public PersianTextView(Context context) {
        super(context);
    }

    public PersianTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public PersianTextView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    public void setText(CharSequence text, BufferType type) {
        if (text != null)
            text = FormatHelper.toPersianNumber(text.toString());
        super.setText(text, type);
    }
}
