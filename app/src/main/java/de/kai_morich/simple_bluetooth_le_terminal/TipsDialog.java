package de.kai_morich.simple_bluetooth_le_terminal;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

import androidx.annotation.NonNull;

public class TipsDialog extends Dialog {

    private Button dialog_tips_confirm;

    public TipsDialog(@NonNull Context context) {
        super(context, R.style.MyDialog1);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        View view=getLayoutInflater().inflate(R.layout.dialog_tips,null);
        setContentView(view);

        dialog_tips_confirm = view.findViewById(R.id.dialog_tips_confirm);
        dialog_tips_confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dismiss();
            }
        });

        WindowManager.LayoutParams layoutParams = getWindow().getAttributes();
        layoutParams.width= WindowManager.LayoutParams.MATCH_PARENT;
        layoutParams.height= WindowManager.LayoutParams.WRAP_CONTENT;
        getWindow().getDecorView().setPadding(0, 0, 0, 0);
        getWindow().setAttributes(layoutParams);

        getWindow().setGravity(Gravity.CENTER);
    }
}
