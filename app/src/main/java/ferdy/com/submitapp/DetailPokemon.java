package ferdy.com.submitapp;


import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailPokemon extends AppCompatActivity {
    public static final String EXTRA_DETAIL = "extra_detail";
    public static final String EXTRA_NAMA = "extra_name";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        Bundle bundle=this.getIntent().getExtras();
        int pic=bundle.getInt("image");
        ImageView dataFoto=findViewById(R.id.data_foto);
        TextView dataNama = findViewById(R.id.data_nama);
        TextView dataDetail = findViewById(R.id.data_detail);
        String detail = getIntent().getStringExtra(EXTRA_DETAIL);
        String nama = getIntent().getStringExtra(EXTRA_NAMA);
        dataNama.setText(nama);
        dataDetail.setText(detail);
        dataFoto.setImageResource(pic);

        ActionBar actionBar;
        actionBar = getSupportActionBar();assert actionBar != null;
        actionBar.setTitle("Detail");
    }
}
