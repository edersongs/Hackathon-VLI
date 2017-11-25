package hackaton.abobora.jerimum;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

    private Button btnAtivar;
    private Button btnManutencao;
    private Button btnDanificado;
    private Button btnReadQr;
    static final String ACTION_SCAN = "com.google.zxing.client.android.SCAN";
    private TextView formatTxt, contentTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        formatTxt = (TextView)findViewById(R.id.scan_format);
        contentTxt = (TextView)findViewById(R.id.scan_content);

        btnReadQr = (Button) findViewById(R.id.btn_qr_code);

        btnReadQr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scanQR();
            }
        });

        btnManutencao = (Button) findViewById(R.id.btn_manutencao);

        btnManutencao.setVisibility(View.GONE);

        btnManutencao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Status do produto foi alterado para manutencao",Toast.LENGTH_SHORT).show();
            }
        });

        btnDanificado = (Button) findViewById(R.id.btn_danificado);

        btnDanificado.setVisibility(View.GONE);

        btnDanificado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Status do produto foi alterado para danificado",Toast.LENGTH_SHORT).show();
            }
        });

        btnAtivar = (Button) findViewById(R.id.btn_ativar);

        btnAtivar.setVisibility(View.GONE);

        btnAtivar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Status do produto foi alterado para ativado",Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void scanQR() {
        try {
            //start the scanning activity from the com.google.zxing.client.android.SCAN intent
            Intent intent = new Intent(ACTION_SCAN);
            intent.putExtra("SCAN_MODE", "QR_CODE_MODE");
            startActivityForResult(intent, 0);
        } catch (ActivityNotFoundException anfe) {
            //on catch, show the download dialog
           // showDialog(MainActivity.this, "No Scanner Found", "Download a scanner code activity?", "Yes", "No").show();
        }
    }

    public void onActivityResult(int requestCode, int resultCode, Intent intent) {
        if (requestCode == 0) {
            if (resultCode == RESULT_OK) {
                //get the extras that are returned from the intent
                String contents = intent.getStringExtra("SCAN_RESULT");
                String format = intent.getStringExtra("SCAN_RESULT_FORMAT");
                formatTxt.setText("FORMAT: " + format);
                contentTxt.setText("CONTENT: " + contents);
//                Toast toast = Toast.makeText(this, "Leitura:" + contents + " Formato:" + format, Toast.LENGTH_LONG);
                btnDanificado.setVisibility(View.VISIBLE);
                btnAtivar.setVisibility(View.VISIBLE);
                btnManutencao.setVisibility(View.VISIBLE);
//                toast.show();
            }
        }
    }
}
