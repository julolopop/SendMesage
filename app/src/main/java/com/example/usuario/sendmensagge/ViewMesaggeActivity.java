package com.example.usuario.sendmensagge;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
/**
 * @Autor Juan Manuel Diaz Ortiz
 * @Version v0.2
 * @Comentario Esta clase recive un mensage de la clase SendMensaggerActivity y la muestra
 */
public class ViewMesaggeActivity extends AppCompatActivity {

    private TextView txvViewMessage;
    private TextView txvViewUser;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_mesagge);

        //se enlaza con el editmessage de View
        txvViewMessage = (TextView)findViewById(R.id.ediMessage);
        txvViewUser = (TextView)findViewById(R.id.ediUserMessage);
        //se recoge el intert y de el se coge el mensage que se envio con el bundle
        txvViewMessage.setText(getIntent().getExtras().getString("message"));
        String viewUser = String.format(getResources().getString(R.string.ediUserMessage),getIntent().getExtras().getString("user"));
        txvViewUser.setText(viewUser);





    }
}
