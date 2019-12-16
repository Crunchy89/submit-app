package ferdy.com.submitapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity  {
    private RecyclerView rvPokemon;
    private ArrayList<Data> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvPokemon= findViewById(R.id.img1);
        rvPokemon.setHasFixedSize(true);

        list.addAll(Pokemon.getListData());
        showRecyclerList();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.about, menu);
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }
    public void setMode(int selectedMode) {
        switch (selectedMode) {
            case R.id.about:
                Intent Tentang = new Intent(MainActivity.this, Tentang.class);
                startActivity(Tentang);
                break;
        }
    }

    private void showRecyclerList(){
        rvPokemon.setLayoutManager(new LinearLayoutManager(this));
        List listPokemon = new List(list);
        rvPokemon.setAdapter(listPokemon);

        listPokemon.setOnItemClickCallback(new List.OnItemClickCallback() {
            @Override
            public void onItemClicked(Data data) {
                showSelectedData(data);
            }
        });

    }

    private void showSelectedData(Data pokemon) {
        Intent Detail = new Intent(MainActivity.this, DetailPokemon.class);
        Bundle bundle=new Bundle();
        bundle.putInt("image",pokemon.getFoto());
        Detail.putExtras(bundle);
        Detail.putExtra(DetailPokemon.EXTRA_NAMA,pokemon.getNama());
        Detail.putExtra(DetailPokemon.EXTRA_DETAIL,pokemon.getDetail());
        startActivity(Detail);
    }
}
