package com.apps.nailham.latihansharedpreference;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.apps.nailham.latihansharedpreference.utils.Preferences;

public class HomeActivity extends AppCompatActivity {

    private TextView txtKeluar;
    private TextView txtName;

     /*
    Tanggal Pengerjaan : 1-mei-2020
    Deskripsi Pengerjaan : Mengerjakan class semua yang terdiri class home,login dan register dan interface serta mengisi semua layout
    NIM : 10117138
    Nama: Ilham Nurjaman
    Kelas : IF-4
    */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        declareView();
        txtKeluar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Clear Set Preferences
                Preferences.setLogout(getBaseContext());

                //Pindah Halaman ke Login
                startActivity(new Intent(getBaseContext(), LoginActivity.class));
                finish();
            }
        });

    }

    private void declareView() {
        txtKeluar = findViewById(R.id.txt_logout);
        txtName = findViewById(R.id.txtName);

        txtName.setText(Preferences.getRegisteredUser(getBaseContext()));
    }
}
