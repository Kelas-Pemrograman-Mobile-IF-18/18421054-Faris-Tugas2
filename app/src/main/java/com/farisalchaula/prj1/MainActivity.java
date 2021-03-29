package com.farisalchaula.prj1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtTampil;
    EditText edtNpm, edtNama, edtKelamin, edtAlamat, edtEmail, edtNomor;
    Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtTampil = (TextView) findViewById(R.id.txtNpmDanNama);
        edtNpm  = (EditText) findViewById(R.id.edtNpm);
        edtNama = (EditText) findViewById(R.id.edtNama);
        edtKelamin = (EditText) findViewById(R.id.edtKelamin);
        edtAlamat = (EditText) findViewById(R.id.edtAlamat);
        edtEmail = (EditText) findViewById(R.id.edtEmail);
        edtNomor = (EditText) findViewById(R.id.edtNomor);

        btnSubmit = (Button) findViewById(R.id.btnSubmit);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strNpm = edtNpm.getText().toString();
                String strNama = edtNama.getText().toString();
                String strKelamin = edtKelamin.getText().toString();
                String strAlamat = edtAlamat.getText().toString();
                String strEmail = edtEmail.getText().toString();
                String strNomor = edtNomor.getText().toString();

                txtTampil.setText("\n" + strNpm + "\n" + strNama + "\n" + strKelamin + "\n" +
                        strAlamat + "\n" + strEmail + "\n" + strNomor);
            }
        });
    }
}
