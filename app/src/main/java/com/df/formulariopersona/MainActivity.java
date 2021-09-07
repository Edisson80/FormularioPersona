package com.df.formulariopersona;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

import es.dmoral.toasty.Toasty;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText txtDocument;
    private EditText txtLastName;
    private EditText txtName;
    private Button btnSubmit;
    private ArrayList<Person>persons = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtName = findViewById(R.id.txtName);
        txtDocument = findViewById(R.id.txtDocument);
        txtLastName = findViewById(R.id.txtLastName);
        btnSubmit = findViewById(R.id.btnIngresar);
        btnSubmit.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId() ==R.id.btnIngresar){
            addPerson();
        }
    }
    private void addPerson(){
        String name = txtName.getText().toString();
        String lastName = txtLastName.getText().toString();
        String document = txtDocument.getText().toString();

        Person person = new Person(name,lastName,document);
        persons.add(person);
        cleanFields();
        Toasty.success(this,"SE INGRESO LOS DATOS DE: " + name + " " + lastName,Toast.LENGTH_SHORT,true).show();
    }
    private void cleanFields(){
        txtLastName.getText().clear();
        txtDocument.getText().clear();
        txtName.getText().clear();
    }
}