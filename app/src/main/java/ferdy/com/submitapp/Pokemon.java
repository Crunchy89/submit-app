package ferdy.com.submitapp;

import java.util.ArrayList;

public class Pokemon {
    private static String[] namaPokemon = {
            "Pikachu",
            "Bulbasaur",
            "Charmander",
            "Squirtle",
            "Eevee",
            "Lapras",
            "Jynx",
            "Snorlax",
            "Magicarp",
            "Mr. Mime"
    };

    private static String[] detailPokemon = {
            "Pikachu adalah Pokémon utama Ash Ketchum. Pokémon ini adalah semacam pika berwarna kuning dan punya keistimewaan tenaga listrik. Pikachu bisa ditemukan di hutan, ladang dan tempat-tempat sumber tenaga listrik.",
            "Warna tubuh Bulbasaur adalah hijau muda dan ia berjalan dengan empat kaki. Evolusi dari Bulbasaur adalah Ivysaur, dan kemudian menjadi Venusaur. Sejak lahir, Bulbasaur telah memiliki semacam tumbuhan yang ada di punggungnya, di mana ketika berevolusi, tumbuhan tersebut akan tumbuh menjadi bunga bangkai.",
            "Ia memiliki ciri khas, yaitu api yang menyala di bagian ekornya, yang sudah ia dapatkan sejak lahir. Diyakini jika api tersebut padam, Pokémon jenis Charmander ini mati.",
            "Squirtle merupakan salah satu jenis Pokémon air berbentuk kura-kura kecil.",
            "Eevee adalah salah satu pokémon bertipe normal. Ia memiliki delapan bentuk evolusi, yaitu: Vaporeon, Jolteon, Flareon, Espeon, Umbreon, Leafeon, Glaceon, dan Sylveon.",
            "Lapras adalah sebuah spesies Pokémon air yang berbentuk seperti dinosaurus pada jaman pra sejarah belum di ketahui apakah bentuk ini adalah evolusi terakhir, kedua atau bentuk awal sebelum evolusi",
            "Jynx adalah pokemon humanoid bertype es Jynx merupakan evolusi kedua dari smooch",
            "Snorlax disebut juga Pokemon tidur karena kebiasaannya yg bisa tidur sampai berbulan bulan lamanya, Snorlax adalah pokemon bertipe normal dengan nafsu makan yang besar.",
            "Magicarp adalah pokemon air berbentuk ikan koi. dikatakan dalam mitologi jepang bahwa ikan koi yang berhasil menaiki air terjun akan menjadi naga, dan itu adalah bentuk evolusi dari magicarp yaitu Gyarados",
            "Mr. Mime adalah pokemon type Psycic dengan kemampuan membuat barier tidak terlihat atau meniru jurus lawan"
    };

    private static int[] gambarPokemon = {
            R.drawable.pikachu,
            R.drawable.bulbasaur,
            R.drawable.charmander,
            R.drawable.squirtle,
            R.drawable.eevee,
            R.drawable.lapras,
            R.drawable.jynx,
            R.drawable.snorlax,
            R.drawable.magicarp,
            R.drawable.mr_mime
    };

    static ArrayList<Data> getListData() {
        ArrayList<Data> list = new ArrayList<>();
        for (int position = 0; position < namaPokemon.length; position++) {
            Data data = new Data();
            data.setNama(namaPokemon[position]);
            data.setDetail(detailPokemon[position]);
            data.setFoto(gambarPokemon[position]);
            list.add(data);
        }
        return list;
    }
}
