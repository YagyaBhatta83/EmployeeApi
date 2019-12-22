package com.yagya.employeeapi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btnShowAllEmployee, btnRegisterEmployee, btnSearchEmployee, btnUpdateDeleteEmployee;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnShowAllEmployee = findViewById(R.id.btnShowAllEmployee);
        btnRegisterEmployee = findViewById(R.id.btnRegisterEmployee);
        btnSearchEmployee = findViewById(R.id.btnSearchEmployee);
        btnUpdateDeleteEmployee = findViewById(R.id.btnUpdateDeleteEmployee);


        btnShowAllEmployee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ShowAllEmployeeActivity.class);
                startActivity(intent);

            }
        });

        btnRegisterEmployee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, RegisterEmployeeActivity.class);
                startActivity(intent);

            }
        });

        btnSearchEmployee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SearchEmployeeActivity.class);
                startActivity(intent);

            }
        });

        btnUpdateDeleteEmployee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, UpdateDeleteEmployeeActivity.class);
                startActivity(intent);

            }
        });
    }
}
