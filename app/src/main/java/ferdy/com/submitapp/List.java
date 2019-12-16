package ferdy.com.submitapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;


public class List extends RecyclerView.Adapter<List.ListViewHolder> {
    private ArrayList<Data> listData;
    private OnItemClickCallback onItemClickCallback;
    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback;
    }
    List(ArrayList<Data> list) {
        this.listData = list;
    }
    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.pokemon_row, viewGroup, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, int position) {
        Data data = listData.get(position);
        Glide.with(holder.itemView.getContext())
                .load(data.getFoto())
                .apply(new RequestOptions().override(55, 55))
                .into(holder.pokeFoto);
        holder.pokeName.setText(data.getNama());
        holder.pokeDetail.setText(data.getDetail());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onItemClickCallback.onItemClicked(listData.get(holder.getAdapterPosition()));
            }
        });

    }

    @Override
    public int getItemCount() {
        return listData.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {

        ImageView pokeFoto;
        TextView pokeName, pokeDetail;

        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            pokeFoto = itemView.findViewById(R.id.fotoPokemon);
            pokeName = itemView.findViewById(R.id.namaPokemon);
            pokeDetail = itemView.findViewById(R.id.detailPokemon);
        }
    }
    public interface OnItemClickCallback {
        void onItemClicked(Data data);
    }
}