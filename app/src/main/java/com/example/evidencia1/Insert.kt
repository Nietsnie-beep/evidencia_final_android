package com.example.evidencia1

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

class Insert : AppCompatActivity() {

        private lateinit var etEmpName: EditText
        private lateinit var etEmpAge: EditText
        private lateinit var etEmpSalary: EditText
        private lateinit var btnSaveData: Button

        private lateinit var dbRef: DatabaseReference

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.insertion_activity)

            etEmpName = findViewById(R.id.etEmpName)
            etEmpAge = findViewById(R.id.etEmpAge)
            etEmpSalary = findViewById(R.id.etEmpSalary)
            btnSaveData = findViewById(R.id.btnSave)

            dbRef = FirebaseDatabase.getInstance().getReference("Employees")

            btnSaveData.setOnClickListener {
                saveEmployeeData()
            }
        }

        private fun saveEmployeeData() {

            //getting values
            val empName = etEmpName.text.toString()
            val empAge = etEmpAge.text.toString()
            val empSalary = etEmpSalary.text.toString()


        }
}