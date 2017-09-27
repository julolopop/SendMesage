package com.example.usuario.sendmensagge;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class SendMensaggerActivity extends AppCompatActivity {

    private EditText edtMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_mensagger);
    }

    public void getonClick(View view) {
        switch (view.getId())
        {
            case R.id.btnOk:
                //1.Crear un objeto  bundle y añadirlo al message
                Bundle bundel = new Bundle();
                //2.recoger mensage
                bundel.putString("message",edtMessage.getText().toString());
                //3.Crear un obj intent
                Intent intent = new Intent(SendMensaggerActivity.this,ViewMesaggeActivity.class);
                intent.putExtra(bundel);
                //4.Iniciar el activity view message
                startActivity(intent);
                break;
        }
    }
}
