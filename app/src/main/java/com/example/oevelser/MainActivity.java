package com.example.oevelser;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements OnClickListener {

    Button btn;
    Button btn01;
    TextView title;
    TextView statusText;
    EditText nameEditText;
    public static EditText urlEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        title = new TextView(this);
        title.setText("Velkommen");
        title = findViewById(R.id.Title);

        nameEditText = new EditText(this);
        nameEditText.setHint("Name");
        nameEditText = findViewById(R.id.NameEditText);

        btn = new Button(this);
        btn.setText("Tryk Her");
        btn = findViewById(R.id.Btn);

        urlEditText = new EditText(this);
        urlEditText.setHint("Url");
        urlEditText = findViewById(R.id.urlEditText);

        btn01 = new Button(this);
        btn01.setText("OK");
        btn01 = findViewById(R.id.Btn01);
        btn01.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                OpenWebView();
            }
        });

        statusText = new TextView(this);
        statusText.setText("Status");
        statusText = findViewById(R.id.StatusText);

        btn.setOnClickListener(this);
    }

    public void OpenWebView(){
        Intent intent = new Intent(this, WebViewActivity.class);
        startActivity(intent);
    }

    public  void onClick(View v){
        String status = "Der er blevet trykket på knappen";
        System.out.println(status);
        statusText.setText(status);

        String editTextContent;
            if (nameEditText.getText().toString() != null) {
                editTextContent = "Velkommen " + nameEditText.getText().toString();
            } else {
                editTextContent = "Velkommen";
            }

            title.setText(editTextContent);
    }
}
