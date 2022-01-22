package com.example.pakarnila;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class FordwardChaining extends AppCompatActivity {

    CheckBox Chcklukaorgan, Chckbercakkapas, Chckinsanmerah, Chcksulitbernafas, Chckgeraklambat, Chckpertumbuhanlambat,
             Chckpendarahantubuh, Chcksisikterkelupas, Chckperutmembusung, Chckikanlemah, Chckmunculpermukaan,
             Chckgelisah, Chckbanyaklendir, Chckgosokbadan;

    Button btnProsesDeteksi;
    TextView tvOutputNamaPenyakit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fordward_chaining);

        Chcklukaorgan = (CheckBox) findViewById(R.id.penyakit1);
        Chckbercakkapas = (CheckBox) findViewById(R.id.penyakit2);
        Chckinsanmerah = (CheckBox) findViewById(R.id.penyakit3);
        Chcksulitbernafas = (CheckBox) findViewById(R.id.penyakit4);
        Chckgeraklambat = (CheckBox) findViewById(R.id.penyakit5);
        Chckpertumbuhanlambat = (CheckBox) findViewById(R.id.penyakit6);
        Chckpendarahantubuh = (CheckBox) findViewById(R.id.penyakit7);
        Chcksisikterkelupas = (CheckBox) findViewById(R.id.penyakit8);
        Chckperutmembusung = (CheckBox) findViewById(R.id.penyakit9);
        Chckikanlemah = (CheckBox) findViewById(R.id.penyakit10);
        Chckmunculpermukaan = (CheckBox) findViewById(R.id.penyakit11);
        Chckgelisah = (CheckBox) findViewById(R.id.penyakit12);
        Chckbanyaklendir = (CheckBox) findViewById(R.id.penyakit13);
        Chckgosokbadan = (CheckBox) findViewById(R.id.penyakit14);

        btnProsesDeteksi = (Button) findViewById(R.id.btn_diagnosa);
        tvOutputNamaPenyakit = (TextView) findViewById(R.id.tv_result);

        tvOutputNamaPenyakit.setText(""); // Kosongkan textView / Nama Penyakit Saat membuka program Sisitem Pakar

        btnProsesDeteksi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String NamaPenyakit = "Anda Menderita penyakit : ";


                // Jenis Gejala Untuk Output Penyakit : Trichodina sp
                if (Chcklukaorgan.isChecked()) {

                    NamaPenyakit += "\nTrichodina Sp";
                }
                // Jenis Gejala Untuk Output Penyakit : Saprolegniasis
                if (Chckbercakkapas.isChecked()) {
                    NamaPenyakit += "\nSaprolegniasis";
                }

                // Jenis Gejala Untuk Output Penyakit : Episylis spp
                if (Chckinsanmerah.isChecked() && Chcksulitbernafas.isChecked() && Chckgeraklambat.isChecked() && Chckpertumbuhanlambat.isChecked()) {
                    NamaPenyakit += "\nEpisylis Spp";
                }

                // Jenis Gejala Untuk Output Penyakit : Bercak Merah
                if (Chckpendarahantubuh.isChecked() && Chcksisikterkelupas.isChecked() && Chckperutmembusung.isChecked() && Chckikanlemah.isChecked() && Chckmunculpermukaan.isChecked()) {

                    NamaPenyakit += "\nBercak Merah";
                }
                // Jenis Gejala Untuk Output Penyakit : Bintik Putih
                if (Chcksulitbernafas.isChecked() && Chckgelisah.isChecked() && Chckbanyaklendir.isChecked() && Chckgosokbadan.isChecked()) {
                    NamaPenyakit += "\nBintik Putih";
                }

                // Jenis Gejala Untuk Output Penyakit : Lernea
                if (Chckgelisah.isChecked() && Chckmunculpermukaan.isChecked() && Chckgosokbadan.isChecked()) {
                    NamaPenyakit += "\nLernea";
                }

                // Tampilkan Hasil Nama Penyakit di textView
                tvOutputNamaPenyakit.setText(""+NamaPenyakit);
            }
        });
    }


    // Baris dibawah ini dihapus juga tidak masalah : inti codingnya hanya berada di tombol proses
    public void onCheckboxClicked123 (View view) {
        boolean checked = ((CheckBox) view).isChecked();
        String str = "";

        switch (view.getId()) {
            case R.id.penyakit1:
                str = checked ? "Gejala Luka Organ Diseleksi " : "Gejala Luka Organ Tidak Diseleksi";
                break;
            case R.id.penyakit2:
                str = checked ? "Gejala Bercak Kapas Diseleksi " : "Gejala Bercak Kapas Tidak Diseleksi";
                break;
            case R.id.penyakit3:
                str = checked ? "Gejala Insan Merah Diseleksi " : "Gejala Insan Merah Tidak Diseleksi";
                break;
            case R.id.penyakit4:
                str = checked ? "Gejala Sulit Bernafas Diseleksi " : "Gejala Sulit Bernafas Tidak Diseleksi";
                break;
            case R.id.penyakit5:
                str = checked ? "Gejala Gerakan Lambat Diseleksi " : "Gejala Gerakan Lambat Tidak Diseleksi";
                break;
            case R.id.penyakit6:
                str = checked ? "Gejala Pertumbuhan Lambat Diseleksi " : "Gejala Pertumbuhan Lambat Diseleksi";
                break;
            case R.id.penyakit7:
                str = checked ? "Gejala Pendarahan Tubuh Diseleksi " : "Gejala Pendarahan Tubuh Diseleksi";
                break;
            case R.id.penyakit8:
                str = checked ? "Gejala Sisik Terkelupas Diseleksi " : "Gejala Sisik Terkelupas Diseleksi";
                break;
            case R.id.penyakit9:
                str = checked ? "Gejala Perut Membusung Diseleksi " : "Gejala Perut Membusung Tidak Diseleksi";
                break;
            case R.id.penyakit10:
                str = checked ? "Gejala Ikan Lemah Diseleksi " : "Gejala Ikan Lemah Tidak Diseleksi";
                break;
            case R.id.penyakit11:
                str = checked ? "Gejala Muncul Permukaan Diseleksi " : "Gejala Muncul Permukaan Tidak Diseleksi";
                break;
            case R.id.penyakit12:
                str = checked ? "Gejala Gelisah Diseleksi " : "Gejala Gelisah Tidak Diseleksi";
                break;
            case R.id.penyakit13:
                str = checked ? "Gejala Banyak Lendir Diseleksi " : "Gejala Banyak Lendir Tidak Diseleksi";
                break;
            case R.id.penyakit14:
                str = checked ? "Gejala Gosok Badan Diseleksi " : "Gejala Gosok Badan Tidak Diseleksi";
                break;
        }

        Toast.makeText(this, str, Toast.LENGTH_SHORT).show();
    }
}
