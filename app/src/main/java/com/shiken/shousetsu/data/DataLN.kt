package com.shiken.shousetsu.data

import com.shiken.shousetsu.R
import com.shiken.shousetsu.dataclass.LightNovel

object DataLN {
    private val judulLN = arrayOf(

        "お隣の天使様にいつの間にか駄目人間にされていた件",
        "青春ブタ野郎シリーズ",
        "やはり俺の青春ラブコメはまちがっている。",
        "Re：ゼロから始める異世界生活",
        "ぼくたちのリメイク",
        "ようこそ実力至上主義の教室へ",
        "ダンジョンに出会いを求めるのは間違っているだろうか",
        "ひげを剃る。そして女子高生を拾う。",
        "ようこそ実力至上主義の教室へ 2年生編",
        "デート・ア・ライブ",
        "転生したらスライムだった件",
        "盾の勇者の成り上がり"

    )

    private val infoLN = arrayOf(
        "Otonari no Tenshi-sama ni Itsu no Ma ni ka Dame Ningen ni Sareteita Ken",
        "Seishun Buta Yarou Shiriizu",
        "Yahari Ore no Seishun Rabukome wa Machigatteiru.",
        "Re:Zero kara Hajimeru Isekai Seikatsu",
        "Bokutachi no Rimeiku",
        "Youkoso Jitsuryoku Shijou Shugi no Kyoushitsu e",
        "Danjon ni Deai o Motomeru no wa Machigatteiru Darou ka",
        "Hige o Soru. Soshite Joshi Kousei o Hirou.",
        "Youkoso Jitsuryoku Shijou Shugi no Kyoushitsu e: 2-nensei-hen",
        "Deeto A Raibu",
        "Tensei Shitara Slime Datta Ken",
        "Tate no Yuusha no Nariagari"

    )

    private val sampulLN = intArrayOf(
        R.drawable.otonari_no_tenshi_sama,
        R.drawable.aobuta,
        R.drawable.oregairu,
        R.drawable.re_zero,
        R.drawable.bokurime,
        R.drawable.youjitsu,
        R.drawable.danmachi,
        R.drawable.higehiro,
        R.drawable.youjitsu_2_nensei,
        R.drawable.date_a_live,
        R.drawable.tensura,
        R.drawable.tate_no_yuusha

    )

    private val  penulis_ilustratorLN = arrayOf(

        "Penulis    : 佐伯さん　Saekisan.\n" +
                "\n"+
                "Ilustrator 1 : 和武はざの　Kazutake Hazano (volume 1).\n" +
                "\n"+
                "Ilustrator 2 : はねこと Hanekoto (volume 2 - seterusnya).",

        "Penulis    : 鴨志田一　Kamoshida Hajime.\n" +
                "\n"+
                "Ilustrator : 溝口ケージ　Mizoguchi Keiji.",

        "Penulis    : 渡航　Watari Wataru.\n" +
                "\n"+
                "Ilustrator : ぽんかん⑧　Ponkan⑧.",

        "Penulis    : 長月達平　Nagatsuki Tappei.\n" +
                "\n"+
                "Ilustrator : 大塚真一郎　Ootsuka Shinichiro.",

        "Penulis    : 木緒なち　Kio Nachi.\n" +
                "\n"+
                "Ilustrator : えれっと　Eretto.",

        "Penulis    : 衣笠彰梧  Kinugasa Shougo.\n" +
                "\n"+
                "Ilustrator : トモセシュンサク   Tomose Shunsaku.",

        "Penulis    : 大森藤ノ  Oomori Fujino.\n" +
                "\n"+
                "Ilustrator : ヤスダスズヒト    Yasuda Suzuhito.",

        "Penulis    : しめさば  Shimesaba.\n" +
                "\n"+
                "Ilustrator : ぶーた    Booota.",

        "Penulis    : 衣笠彰梧  Kinugasa Shougo.\n" +
                "\n"+
                "Ilustrator : トモセシュンサク   Tomose Shunsaku.",

        "Penulis    : 橘公司   Tachibana Koushi.\n" +
                "\n"+
                "Ilustrator : つなこ    Tsunako.",

        "Penulis    : 伏瀬    Fuse.\n" +
                "\n"+
                "Ilustrator : みっつばー  Mitz Vah.",

        "Penulis    : アネコユサギ    Aneko Yusagi.\n" +
                "\n"+
                "Ilustrator : 弥南せいら  Minami Seira."

    )

    private val terbitLN = arrayOf(

        "14 Juni 2019 - Sekarang",

        "10 April 2014 - Sekarang",

        "18 Maret 2011 - 19 November 2019",

        "23 Januari  2014 - Sekarang",

        "25 Maret 2017 - Sekarang",

        "25 Mei 2015 - 25 September 2019",

        "15 Januari 2013 - Sekarang",

        "1 Februari 2018 - 1 Juni 2021",

        "24 Januari 2020 - Sekarang",

        "19 Maret 2011 - 19 Maret 2020",

        "30 Mei 2014 - Sekarang",

        "22 Agustus 2013 - Sekarang"

    )

    private val penerbitLN = arrayOf(

        "Penerbit   :「SBクリエイティブ」SB Creative \n" +
                "\n"+
                "Label  :「GA文庫」GA Bunko",

        "Penerbit   :「アスキー · メディアワークス」ASCII Media Works \n" +
                "\n"+
                "Label  :「電撃文庫」Dengeki Bunko",

        "Penerbit   :「小学館」Shogakukan \n" +
                "\n"+
                "Label  :「ガガガ文庫」Gagaga Bunko",

        "Penerbit   :「メディアファクトリー」Media Factory \n" +
                "\n"+
                "Label  :「MF文庫J」MF Bunko J",

        "Penerbit   :「メディアファクトリー」Media Factory \n" +
                "\n"+
                "Label  :「MF文庫J」MF Bunko J",

        "Penerbit   :「メディアファクトリー」Media Factory \n" +
                "\n"+
                "Label  :「MF文庫J」MF Bunko J",

        "Penerbit   :「SBクリエイティブ」SB Creative \n" +
                "\n"+
                "Label  :「GA文庫」GA Bunko",

        "Penerbit   :「角川書店」Kadokawa Shoten \n" +
                "\n"+
                "Label  :「角川スニーカー文庫」Kadokawa Sneaker Bunko",

        "Penerbit   :「メディアファクトリー」Media Factory \n" +
                "\n"+
                "Label  :「MF文庫J」MF Bunko J",

        "Penerbit   :「富士見書房」Fujimi Shobo \n" +
                "\n"+
                "Label  :「富士見ファンタジア文庫」Fujimi Fantasia Bunko",

        "Penerbit   :「マイクロマガジン」Micro Magazine \n" +
                "\n"+
                "Label  :「GCノベルズ」GC Novels",

        "Penerbit   :「メディアファクトリー」Media Factory \n" +
                "\n"+
                "Label  :「MFブックス」MF books"

    )

    private val genreLN = arrayOf(

        "Komedi, Romantis",

        "Komedi, Romantis",

        "Komedi, Romantis",

        "Drama, Fantasi",

        "Komedi, Romantis",

        "Psikologis",

        "Petualangan, Fantasi",

        "Komedi, Romantis, Drama",

        "Psikologis",

        "Komedi, Romantis, Harem",

        "Isekai, Fantasi",

        "Isekai, Fantasi"

    )

    private  val volumeLN = arrayOf(

        "8 Volume : 7 Cerita utama + 1 Cerita pendek",

        "11 Volume",

        "19 Volume",

        "43 Volume : 31 Cerita utama + 7 Cerita pendek + 5 Cerita sampingan",

        "14 Volume",

        "14 Volume : 11 Cerita utama + 3 Cerita pendek",

        "17 Volume",

        "8 Volume",

        "9 Volume : 8 Cerita utama + 1 Cerita pendek",

        "33 Volume : 22 Cerita utama + 11 Cerita pendek",

        "19 Volume",

        "22 Volume"

    )

    private val deskripsiLN = arrayOf(

        "お隣の天使様にいつの間にか駄目人間にされていた件　Otonari no Tenshi-sama ni Itsunomanika Dame Ningen ni Sareteita Ken adalah seri light novel atau novel ringan Jepang yang ditulis oleh 佐伯さん　Saekisan dan diilustrasikan oleh　和武はざの　Kazutake Hazano (volume 1) dan はねこと Hanekoto (volume 2 - seterusnya). Seri ini juga dibuat menjadi Manga, dan juga adaptasi Anime yang akan mulai tayang pada Bulan 1 Tahun 2023.",

        "青春ブタ野郎シリーズ Seishun Buta Yarou Shirizu juga disingkat dan dikenal dengan　青ブタ AoButa. Adalah seri light novel atau novel ringan Jepang yang ditulis oleh 鴨志田一　Kamoshida Hajime dan diilustrasikan oleh　溝口ケージ　Mizoguchi Keiji. Seri ini terdapat juga dalam versi manga dan 2 judul dari series ini sudah mendapatkan adaptasi anime, yang pertama dalam bentuk seri yaitu 『青春ブタ野郎はバニーガール先輩の夢を見ない』 \"Seishun Buta Yarou wa Banii Gaaru Senpai no Yume o Minai\" dan dalam bentuk film 『青春ブタ野郎はゆめみる少女の夢を見ない』 \"Seishun Buta Yarou wa Yumemiru Shoujo no Yume o Minai\". Saat ini produksi adaptasi anime terbaru dari seri ini pun telah diumumkan pada bulan 9 tahun 2022 yang dimana mengangkat 2 judul dari seri ini『青春ブタ野郎はおでかけシスターの夢を見ない』 \"Seishun Buta Yarou wa Dekake Shisutaa no Yume o Minai\" dan 『青春ブタ野郎はランドセルガールの夢を見ない』 \"Seishun Buta Yarou wa Randoseru Gaaru no Yume o Minai\".",

        "やはり俺の青春ラブコメはまちがっている。 Yahari Ore no Seishun Rabukome wa Machigatteiru. juga disingkat dan dikenal dengan　俺ガイル OreGairu adalah seri light novel atau novel ringan Jepang yang ditulis oleh　渡航　Watari Wataru dan diilustrasikan oleh ぽんかん⑧ Ponkan⑧. Seri ini juga tersedia dalam bentuk Manga dan juga telah diadaptasi menjadi anime dan sebanyak 3 musim beserta OVA dilamnya dan sudah tamat, yaitu 『やはり俺の青春ラブコメはまちがっている。』 \"Yahari Ore no Seishun Rabukome wa Machigatteiru\", 『やはり俺の青春ラブコメはまちがっている。続』 \"Yahari Ore no Seishun Rabukome wa Machigatteiru Zoku\" dan 『やはり俺の青春ラブコメはまちがっている。完』 \"Yahari Ore no Seishun Rabukome wa Machigatteiru Kan\".",

        "Re：ゼロから始める異世界生活 Re:Zero kara Hajimeru Isekai Seikatsu juga disingkat dan dikenal dengan Reゼロ ReZero atau リゼロ RiZero adalah seri light novel atau novel ringan Jepang yang ditulis oleh 長月達平 Nagatsuki Tappei dan diilustrasikan oleh 大塚真一郎 Ootsuka Shinichiro. Novel ringan ini juga tersedia dalam versi manga dan novel ringan ini juga telah diadaptasi menjadi anime sebanyak 2 musim seri anime 『Re:ゼロから始める異世界生活』 dan 『Re:ゼロから始める異世界生活 2nd season』 dan 2 OVA 『Re:ゼロから始める異世界生活 Memory Snow』 dan 『Re:ゼロから始める異世界生活氷結の絆』 \"Hyouketsu no Kizuna\".",

        "ぼくたちのリメイク Bokutachi no Remake juga disingkat dan dikenal dengan　ぼくリメ　BokuRime adalah seri light novel atau novel ringan Jepang yang ditulis oleh　木緒なち　Kio Nachi　dan diilustrasikan oleh　えれっと　Eretto. Novel ringan ini juga tersedia dalam versi manga dan novel ringan ini juga telah diadaptasi menjadi anime sebanyak 1 musim.",

        "ようこそ実力至上主義の教室へ　Youkoso Jitsuryoku Shijou Shugi no Kyoushitsu e, juga disingkat dan dikenal dengan　よう実　YouJitsu adalah seri light novel atau novel ringan Jepang yang ditulis oleh 衣笠彰梧 Kinugasa Shougo dan diilustrasikan oleh　トモセシュンサク Tomose Shunsaku. Novel ringan ini juga tersedia dalam versi manga dan novel ringan ini juga telah diadaptasi menjadi anime sebanyak 2 musim dan 1 musim sekarang dalam tahap produksi.",

        "ダンジョンに出会いを求めるのは間違っているだろうか　Dungeon ni Deai o Motomeru no wa Machigatteiru Darou ka. juga disingkat dan dikenal sebagai ダンまち DanMachi adalah seri light novel atau novel ringan Jepang yang ditulis oleh 大森藤ノ Oomori Fujino dan diilustrasikan oleh ヤスダスズヒト Yasuda Suzuhito. Novel ringan ini juga tersedia dalam versi manga dan novel ringan ini juga telah diadaptasi menjadi anime sebanyak 4 musim dari cerita utama yang dimana sekarang bagian ke 2 dari musim ke 4 yaitu 『ダンジョンに出会いを求めるのは間違っているだろうかⅣ深章 厄災篇』 \"Dungeon ni Deai wo Motomeru no wa Machigatteiru Darou ka IV: Fukashou Yakusaihen\" tayang mulai januari 2023, kemudian 1 musim dari cerita sampingan 『ソード・オラトリア ダンジョンに出会いを求めるのは間違っているだろうか外伝』 \"Soodo Orantoria Danjon ni Deai o Motomeru no wa Machigatteiru Darou ka\" dan 1 cerita original dalam bentuk film 『劇場版 ダンジョンに出会いを求めるのは間違っているだろうか -オリオンの矢-』 \"Genjouban Danjon ni Deai o Motomeru no wa Machigatteiru Darou ka - Orion no Ya-\".",

        "ひげを剃る。そして女子高生を拾う。 Hige o Soru. Soshite Joshi Kousei o Hirou., juga disingkat dan dikenal sebagai ひげひろ HigeHiro adalah seri light novel atau novel ringan Jepang yang ditulis oleh しめさば Shimesaba dan diilustrasikan oleh ぶーた Booota. Novel ringan ini juga tersedia dalam versi manga dan novel ringan ini juga telah diadaptasi menjadi anime sebanyak 1 musim dan sudah tamat.",

        "ようこそ実力至上主義の教室へ 2年生編　Youkoso Jitsuryoku Shijou Shugi no Kyoushitsu e: 2 nenseihen adalah seri light novel atau novel ringan Jepang yang merupakan seri lanjutan dari Youkoso Jitsuryoku Shijou Shugi no Kyoushitsu e yang ditulis oleh 衣笠彰梧 Kinugasa Shougo dan diilustrasikan oleh トモセシュンサク Tomose Shunsaku. Novel ringan ini juga tersedia dalam versi manga.",

        "デート・ア・ライブ　Date A Live adalah seri light novel atau novel ringan Jepang yang ditulis oleh 橘公司 Tachibana Koushi dan diilustrasikan oleh つなこ Tsunako. Novel ringan ini juga sempat tersedia dalam versi manga yang dimana tidak dilanjutkan untuk penerbitan manga-nya. Novel ringan ini juga telah diadaptasi menjadi anime sebanyak 4 musim dari cerita utama dan 1 musim sekarang dalam tahap produksi yang dimana diumumkan pada akhir episode musim ke 4, kemudian 1 judul dari cerita utama dalam bentuk film 『劇場版デート・ア・ライブ 万由里ジャッジメント』 \"Genjouban Deeto A Raibu Mayuri Jajjimento\", 2 buah spin off OVA 『デート・ア・ライブ フラグメント デート・ア・バレット』 \"Deeto A Raibu Furagumento Deeto A Baretto\" dan 『デート・ア・ライブ デッド・オア・バレット』 \"Deeto A Raibu Deeto Oa Baretto\", Date a Date, dan 『デッド・ア・バレットナイトメア・オア・クイーン \"Deeto A Raibu Naitomea Oa Kuiin \".",

        "転生したらスライムだった件　Tensei Shitara Slime Datta Ken juga disingkat dan dikenal sebagai 転スラ TenSura adalah seri light novel atau novel ringan Jepang yang ditulis oleh 伏瀬 Fuse dan diilustrasikan oleh みっつばー　Mitz Vah. Novel ringan ini juga tersedia dalam versi manga dan manga dari novel ringan ini juga telah diadaptasi menjadi anime sebanyak 2 musim dari cerita utama, kemudian 1 seri spin off 『転生したらスライムだった件 転スラ日記』 \"Tensei Shitara Slime Datta Ken Tensura Nikki\", dan 1 buah film yang saat mulai tayang dari 25-11-2022 『劇場版 転生したらスライムだった件 紅蓮の絆編』 \"Genjouban Tensei Shitara Slime Datta Ken Guren no Kizuna-hen\".",

        "盾の勇者の成り上がり　Tate no Yuusha no Nariagari juga disingkat dan dikenal sebagai 盾の勇者 Tate No Yuusha adalah seri light novel atau novel ringan Jepang yang ditulis oleh アネコユサギ Aneko Yusagi dan diilustrasikan oleh　弥南せいら　Minami Seira. Novel ringan ini juga tersedia dalam versi manga dan novel ringan ini juga telah diadaptasi menjadi anime sebanyak 2 musim dan 1 musim saat ini dalam tahap produksi."

    )

    private val plotLN = arrayOf(

        "Pada musim gugur SMA Kelas 1, 藤宮周 Fujimiya Amane yang tidak bisa melihat dan mengabaikan pun menyodorkan payung yang sedang dia pakai kepada seorang gadis yang disebut “MALAIKAT” 椎名真昼 Shiina Mahiru  yang basah kehujanan dan tetap diam tidak bergerak di taman, kemudian 藤宮周 Fujimiya Amane terkena flu. 真昼 Mahiru yang datang untuk mengembalikan payung pun merasa bersalah dan menawarkan untuk merawatnya, tetapi dia terkejut dengan kamar yang kotor dan kebiasaan makan yang tidak sehat dari tetangganya 周 Amane, 真昼 Mahiru pun membantu membersihkannya dan mengantarkan lauk pauk untuknya. Tak lama waktu berjalan 真昼 Mahiru kemudian membuatkan makan malam dan makan berdua di kamar 周 Amane.\n" +
                "Begitulah awal cerita dari seorang laki-laki yang sopan　藤宮周 Fujimiya Amane yang tidak tertarik dengan “MALAIKAT” buatan dan seorang gadis 椎名真昼 Shiina Mahiru yang tidak menunjukkan sikap “MALAIKAT” tapi menunjukkan sikap aslinya yang terus terang dan tajam. Saat berbagi waktu yang sama, keduanya secara bertahap terbuka, saling mengenal, dan lambat laun menjadi tertarik satu sama lain.",

        "Kehidupan seorang laki-laki SMA bernama 梓川 咲太 Azusagawa Sakuta yang menjadi tidak terduga setelah ia bertemu dengan aktris remaja bernama 桜島 麻衣 Sakurajima Mai yang berpakaian gadis kelinci dan berkeliling di dalam perpustakaan tanpa disadari oleh siapa pun di sana. 麻衣Mai heran karena 咲太 Sakuta adalah satu-satunya orang yang dapat melihatnya sementara orang lain tidak, bahkan ketika ia berpakaian normal atau mencoba menjauh dari kehidupan selebriti. 咲太 Sakuta menyebut fenomena ini sebagai \"Sindrom Pubertas\" dan memutuskan untuk memecahkan misteri ini, selain mencoba untuk dekat dengan 麻衣 Mai dan bertemu gadis-gadis lain yang juga menderita \"Sindrom Pubertas\".",

        "Di sebuah sekolah SMA 千葉市立総武高等学校 SMA Soubu Chiba, 千葉市 Kota Chiba. Ada dari seorang laki-laki Kelas 2 SMA yang merupakan penyendiri 比企谷 八幡 Hikigaya Hachiman yang dipaksa bergabung ke Klub Relawan Sekolah oleh gurunya yang juga menjadi guru pembimbing dari 奉仕部 Klub Relawan sekolahnya 平塚 静 Hiratsuka Shizuka, yang kemudian dia bertemu dengan seorang yang dikenal sebagai gadis jenius dan anggota satu-satunya klub tersebut  雪ノ下 雪乃 Yukinoshita Yukino yang juga merupakan seorang penyendiri tetapi kepribadian dan prinsip pemikirannya sangat berbeda dengan 八幡 Hachiman.\n" +
                "Melihat mereka berdua yang konflik pendapat, 静 Shizuka pun mengadakan pertandingan untuk mereka berdua dan yang pemenangnya ditentukan dengan jumlah orang yang berhasil di bantu. Klien pertama mereka adalah 由比ヶ浜 結衣 Yuigahama Yui yang merupakan gadis periang teman sekelas 八幡 Hachiman yang di mana 結衣 Yui terlihat seperti menyembunyikan perasaan spesial kepada 八幡 Hachiman dan akhirnya setelah konsultasi tersebut 結衣 Yui pun bergabung ke dalam klub tersebut.",

        "Suatu malam ナツキ・スバル Natsuki Subaru yang merupakan remaja SMA tiba-tiba dipindahkan ke Isekai (dunia lain) saat pulang dari berbelanja di toko. Setibanya ke Isekai (dunia lain) dia menemukan dirinya menemukan dirinya di pasar, tak lama ketika meninggalkan pasar nyawanya terancam ketika diserang oleh penjahat dan dia diselamatkan oleh seorang gadis setengah elf berambut perak yang memperkenalkan dirinya sebagai サテラSatella yang di temani oleh roh berwujud kucing yang bernama パック Pack. Untuk membalas budi サテラ Satella memutuskan untuk membantu mereka berdua mencari lencananya yang dicuri oleh gadis bernama フェルト Felt. スバル Subaru dan サテラ Satella melakukan perjalanan ke rumah penjarahan tempat di mana フェルト Felt akan menjual lencana tersebut. Di sana, フェルト Felt ditemukan dalam keadaan sudah mati, dan tak lama setelah memasuki rumah mereka berdua juga turut terbunuh.\n" +
                "スバル Subaru pun terbangun dan berada di pasar tempat awal dia muncul di isekai, Setelah itu, sambil mengulang kematian beberapa kali スバル Subaru pun sadar kekuatan yang dia miliki di isekai tersebut yaitu kekuatan mengulang waktu yang di sebut 「死に戻り」\"Return by Death\" atau Kembali dengan Kematian, yang dimana ketika mati dia akan kembali ke tempat tertentu yang dia kunjungi sebelum dia mati. Setelah スバル Subaru bertemu dan berbicara lagi dengan gadis yang mengaku bernama サテラ Satella yang di mana gadis berkata kalau dia tidak tahu nama tersebut, スバル Subaru pun tersadar kalau dia dia menggunakan nama samaran di 'putaran sebelumnya'. Setelah itu, melalui banyak liku-liku, dia akhirnya memojokkan フェルト Felt, gadis yang mencuri lambang tersebut, namun スバル Subaru sekali lagi dibunuh secara brutal oleh pelanggan フェルトFelt 『腸狩り』 “Pemburu Usus” エルザ・グランヒルテ Eruza Guranhirute (Elsa Granhiert). Setelah hidup kembali スバル Subaru bertemu dengan 『剣聖』\"Sword Saint\"  Ahli Pedang ラインハルト Reinhard yang kali ini menyelamatkan スバル Subaru dari penjahat. Dengan bantuan 「サテラ」\"Satella\" dan 『剣聖』 \"Sword Saint\" Reinhardt, dia mengalahkan エルザ Elsa dan akhirnya berhasil lolos dari lingkaran kematian pertama.\n" +
                "Sebagai ucapan terima kasih karena telah menyelamatkan nyawa 「サテラ」”Satella”, スバル Subaru memintanya untuk memberitahu nama aslinya. Dia kemudian memberitahu bahwa nama aslinya adalah エミリア Emilia. Tepat setelah itu, luka di perutnya yang dia terima dari エルザ Elsa terbuka dan dia pingsan. Setelah pulih dari lukanya スバル Subaru terbangun di kediaman milik ロズワール Roswaal, lalu dia meminta kepada エミリア Emilia  adar dirinya diperkerjakan di sana, dan di sana dia bertemu dengan pelayan yaitu kakak dan adik dari ras iblis レム Rem dan ラム Ram, dan dia juga bertemu dengan gadis yang menjaga perpustakaan ベアトリス Beatrice. ",

        "Pada tahun 2016 橋場恭也 Hashiba Kyouya laki-laki berumur 28 tahun yang bekerja untuk perusahaan pembuatan game yang tidak laku. Diombang-ambingkan oleh presiden perusahaan yang tidak memiliki perencanaan, sembari sebagai seorang pengarah yang dicari-cari untuk membereskan kesalahan yang dibuat pekerja lain, begitulah hari-hari yang dia lalui. Namun suatu hari presiden perusahaan menghilang dan perusahaan juga disita sebagai jaminan hutang, dia pun menjadi kehilangan pekerjaannya.\n" +
                "Melihat sosok kreator yang seusia dengannya 川越 京一 Kawagoe Kyouichi, 秋島シノ Akishima Shino、N@NA Nana, yang bergerak dengan energi penuh, sembari mengagumi mereka, dalam kekecewaan dia kembali ke rumah orang tuanya, dia menemukan pemberitahuan kelulusannya dahulu saat tes ujian masuk universitas seni yang tidak jadi dia pilih karena memutuskan memilih jurusan lain, dia pun berbaring di tempat tidurnya sembari masih tertekan. Saat bangun dia menyadari bahwa lingkungan sekelilingnya kembali ke tahun 2006 dan dirinya kembali berumur 18 tahun. Untuk mengubah kehidupannya, dia pun memutuskan untuk pergi ke perguruan tinggi seni, yang dia tinggalkan saat itu.\n" +
                "Di sana dia bertemu dengan penghuni Asrama Universitas, きたやま荘 Kitayama Sou yang sama dengannya yaitu 鹿苑寺貫之 Rokuonji Tsurayuki, 志野亜貴 Shino Aki, 小暮奈々子 Kogure Nanako , dia juga bertemu dengan 河瀬川英子 Kawasegawa Eiko yang penuh bakat, 火川 元気郎 Genkiro Hikawa yang unik dan yang lainnya,  dan menjalani kehidupan kampus yang sibuk dan memuaskan. Di tengah itu 恭也 Kyouya dan teman seasramanya yang membuat tugas proyek dari universitas pun membentuk Tim yang bernama Tim Kitayama bersama teman seasramanya tersebut.",

        "綾小路清隆 Ayanokouji Kiyotaka masuk ke salah satu sekolah paling bergengsi yang didirikan pemerintah Jepang 高度育成高等学校 SMA Pembinaan Tingkat Tinggi (SMA Pembinaan Lanjutan). SMA ini merupakan SMA yang menerapkan sistem khusus bagi para siswanya, di SMA ini para siswa dikelompokkan menjadi kelas A, B, C ,D yang di mana kelas A merupakan kelas yang menjadi target capaian para siswa kelas B, C, D dan siswa kelas A yang mempertahankan posisi mereka.\n" +
                "綾小路清隆 Ayanokouji Kiyotaka ditempatkan di kelas D, yang di mana sekolah membuang siswa yang prestasinya sangat rendah dan bermasalah. Dia bersikap seperti seorang siswa pendiam dan sederhana yang tidak pandai berteman dan lebih suka menjaga jarak, tetapi memiliki kecerdasan dan kekuatan yang sengaja dia sembunyikan. Di sana pertama-tama, dia bertemu dengan gadis bernama 堀北鈴音 Horikita Suzune dan 櫛田桔梗 Kushida Kikyou, yang merupakan teman sekelasnya. Dia dan teman kelas lainnya pun mulai terlibat dalam banyak urusan dan masalah dengan kelas lainnya yang mengincar kelas A dengan cara apapun. ",

        "Di sebuah kota bernama Orario di mana dewa-dewi turun dan membatasi kekuatan mereka untuk memahami dan mengalami kesulitan yang dirasakan di dunia, karena kekuatan mereka yang dibatasi  dewa-dewi hanya bisa memberikan anugerah kepada manusia yang merupakan 冒険者 petualang yang bergabung dengan ファミリア Famiria (Familia) dewa-dewi tersebut. Para 冒険者 petualang mengunjungi dungeon untuk menjalankan misi dari serikat petualang, mengalahkan monster dan mengambil pecahan kristal yang akan digunakan untuk membuat benda sihir, mencari harta lainnya, untuk menaikkan level mereka dan untuk mencari uang.\n" +
                "Salah satu ファミリア Famiria (Familia) yang ada adalah ヘスティア・ファミリア Hestia Famiria (Familia) yang merupakan familia dari Dewi Hestia yang di mana anggota satu-satunya adalah ベル・クラネル Beru Kuraneru (Bell Cranel) seorang pemuda yang merupakan petualang. ベル・クラネル Beru Kuraneru (Bell Cranel) bekerja keras setiap hari di dungeon untuk memenuhi kebutuhan sekaligus meningkatkan kemampuan diri sendiri. Suatu hari saat berburu di dungeon nasib buruk menimpanya yang di mana dia tiba-tiba diserang oleh Minotaur yang seharusnya tidak ada di lantai tingkat di mana dia sedang berburu. ネル Bell yang saat itu terpojok tak berdaya, diselamatkan tepat pada waktunya oleh anggota  ロキ・ファミリア Roki Famiria (Loki Famili) yaitu seorang gadis bernamaアイズ・ヴァレンシュタイン Aizu Warenshutain (Ais Wallenstein) namun setelah diselamatkan ベル Beru (Bell) melarikan diri dari tempat itu tanpa mengucapkan terima kasih.\n" +
                "Di banding syok dengan pertemuan tersebut ベル Beru (Bell) jatuh cinta pada アイズ Aizu (Ais) pada pandangan pertama, dan bersumpah untuk menjadi petualang hebat yang akan menandinginya. Hal ini adalah yang menjadi pemicu skill yang sangat unik yang dimiliki ベル Beru (Bell) yaitu, 憧憬一途(リアリス・フレーゼ) Riarisu Fureize (Liaris Freese), yang dimana dia dapat mencapai pertumbuhan yang luar biasa cepat selama dia sedang jatuh cinta, kekuatan efek sesuai dengan tingkat perasaan pengguna, dan sebagai efek samping membuatnya kebal terhadap pesona. Akan tetapi skill ini dirahasiakan oleh. ヘスティア Hestia karena dia tahu kalau skill tersebut akan diincar oleh para dewa-dewi lain.\n" +
                "Disisi lain ベル Beru (Bell)  tidak menyadari bahwa wanita lain juga tertarik dengan dirinya baik manusia maupun para dewi, terutama ヘスティア Hestia dan フレイヤ Fureiya (Freya) yang merupakan dewi. Dalam petualangannya dan usaha untuk meningkatkan kemampuannya  serta mengembangkan ファミリア Famiria (Familia) agar bisa naik ke level yang tinggi ベル Beru (Bell)  menghadapi berbagai rintangan yang sulit dan bertemu dengan banyak teman dan juga lawan.",

        "Seorang pegawai kantor di perusahaan IT yang bernama 吉田 Yoshida akhirnya mengumpulkan keberanian untuk mengakui perasaannya terhadap atasannya, 後藤 愛依梨 Gotou Airi yang umurnya 2 tahun lebih tua darinya dan dia terus dia cintai selama 5 tahun. Sayangnya, 吉田 Yoshida akhirnya ditolak 後藤 Gotou yang mengaku kalau sudah memiliki pacar. 吉田 Yoshida pun pergi minum dengan rekan kerja sekaligus sahabatnya, 橋本 Hashimoto, untuk menghilangkan kesedihannya.\n" +
                "Di tengah perjalanan pulang ke apartemennya dalam keadaan mabuk, ia tidak sengaja bertemu seorang gadis berseragam SMA yang meringkuk di belakang tiang listrik. Saat 吉田 Yoshida memanggilnya, gadis itu mengajukan usul yang mengejutkan 「ヤらせてあげるから泊めて」“Akan aku biarkan melakukannya jadi biarkan aku menginap”, ketika 吉田 Yoshida menolaknya, gadis itu pun membalas 「じゃあ、只で泊めて」”Kalau begitu menginap cuma-cuma”. Meskipun dibilang malam hari tapi ada mata tetangga, 吉田 Yoshida pun memutuskan membiarkan dia menginap dengan maksud akan di usir keesokan harinya. 吉田 Yoshida yang mabuk berat pun langsung tertidur di kasurnya, tapi dia bergumam 「味噌汁がのみたい」”Ingin minum sup miso”.\n" +
                "吉田 Yoshida yang terbangun keesokan harinya, dia sadar ada gadis SMA yang membuat sup miso di dapurnya, 吉田 Yoshida memastikan dan lega bahwa dia tidak menyerangnya (saat dia tidak sadarkan diri) tadi malam. Gadis itu menyebut namanya 沙優 Sayu, 吉田 Yoshida pun memakan sup miso yang dibuat olehnya dan kehilangan kesempatan untuk mengusirnya.\n" +
                "Karena tetap ditanyai oleh 沙優 Sayu, 吉田 Yoshida pun bercerita kalau ditolak oleh 後藤 Gotou. 沙優 Sayu pun memprovokasi「私が慰めてあげようか」”Aku akan menghiburmu”, tetapi 吉田 Yoshida menolaknya dengan etika dan perasaan benarnya. 沙優 Sayu pun melanjutkan  「目の前にヤッてもいいって言ってる女子がいるのに、なんで襲わないわけ？今までなんにも要求しないで親切に泊めてくれる人なんていなかったよ」”Di depan matamu ada gadis yang bilang ‘kamu boleh melakukannya’ padahal, kenapa tidak menyerang? Sampai sekarang tidak pernah ada orang yang berbaik hati membiarkanku tinggal tanpa menuntut apa pun lo” . 吉田 Yoshida pun kehilangan kata-kata.\n" +
                "沙優 Sayu 北海道 Hokkaidou, 2 SMA 旭川市 Kota Asahikawa 「（親は）多分いなくなってせいせいしているから大丈夫。ここから追い出されたら、今までと同じように泊めてくれる人を探す」”(Orang tua) mungkin sudah tidak ada, aku merasa lega jadi tidak apa-apa. Kalau diusir dari sini, sama seperti sebelumnya mencari orang yang membiarkan menginap ” begitulah kataya. 吉田 Yoshida sadar kalau etika dan nilai sayu sangat parah melenceng, dia pun menyetujui sayu untuk tinggal dengan syarat bekerja, dan dia menyatakan akan aku hancurkan pemikiran bodohmu itu.\n" +
                "Kemampuan mengerjakan pekerjaan rumah 沙優 Sayu di atas dugaan 吉田 Yoshida. 吉田 Yoshida kemudian membelikan 沙優 Sayu pakaian dan futon, serta smartphone untuk berkomunikasi . Ketika 沙優 Sayu mengatakan khawatir tentang 吉田 Yoshida yang sepenuh hati berbaik hati padanya tanpa meminta apa pun, 吉田 Yoshida pun berkata 「沙優のおかげで自分の生活がかなり楽しいものになった。ここにいてくれ」”Berkat Sayu kehidupanku jadi hal yang sangat menyenangkan. Tetaplah di sini” begitulah dia menjelaskan perasaan jujurnya.",

        "清隆 Kiyotaka dan yang lainnya kini menjadi siswa kelas 2, dan mulai tahun ini, sebuah aplikasi baru yang diusulkan oleh 南雲 Nagumo yang mengukur kemampuan masing-masing siswa “OAA (Over All Ability)” diperkenalkan.\n" +
                "Siswa baru juga sudah memenuhi syarat dan diterima, tapi dalam siswa baru tersebut terdapat alumni dari ホワイトルーム White Room yang merupakan bagian dari Konspirasi 月城理事長代行 Pejabat Ketua Tsukishiro untuk mengeluarkan 清隆 Kiyotaka dari SMA. 清隆 Kiyotaka pun waspada dengan sosok siswa yang belum jelas tersebut, tapi di ujian khusus bulan April dia harus berpasangan dengan para siswa baru tersebut.",

        "Sekitar 30 tahun telah berlalu semenjak terjadinya bencana gempa spasial besar tak terduga yang disebabkan oleh kemunculan makhluk misterius yaitu 精霊 Seirei (Roh).\n" +
                "Seorang laki-laki siswa SMA bernama 五河 士道 Itsuka Shidou yang tinggal berdua dengan adik perempuannya bertemu dengan 精霊 Seirei (Roh) yang putus asa dari manusia. Kemudian dari adiknya 五河 琴里 Itsuka Kotori, dia pun diberitahu bahwa dia dapat bernegosiasi dengan 精霊 Seirei (Roh), juga dapat menyelamatkan keduanya baik 精霊 Seirei (Roh) dan Dunia. Setelah latihan yang tidak masuk akal dari adiknya, 士道 Shidou pun bertemu lagi dengan gadis roh tersebut dan memberinya nama 十香 Tooka.\n" +
                "Kemudian saat 士道 Shidou berulang-kali melakukan ”デート” kencan dengan berbagai 精霊 Seirei (Roh), dia pun menjadi tahu asal dirinya, keberadaan detail dari 精霊 Seirei (Roh), dan konspirasi yang mengelilinginya.\n",

        "三上悟 Mikami Satoru yang merupakan seorang karyawan biasa berumur 37 tahun yang masih perjaka. Ia tewas ditusuk ketika melindungi juniornya dari seorang penyerang tak dikenal saat berjalan kaki.\n" +
                "Dia pun terbangun di sebuah gua dan sadar kalau dia telah bereinkarnasi ke Isekai (dunia lain) menjadi スライム Suraimu (Slime), ketika menjelajahi gua tersebut sembari mempelajari, mencoba dan meningkatkan kemampuan yang dia miliki dia pun bertemu dengan 暴風竜ヴェルドラ Naga Badai Verudora (Veldora) yang disegel selama 300 tahun karena telah menghancurkan sebuah kota menjadi abu. Karena 悟 Satoru yang sekarang bersosok sebagai スライム Suraimu (Slime), bersimpati kepada ヴェルドラ Verudora (Veldora) atas kesulitan dan kesepian yang dia lalui, dia kemudian berteman dengannya dan berjanji untuk membantu melepaskan segel kurungan tersebut.\n" +
                "Sebagai imbalannya,  ヴェルドラ Verudora (Veldora) memberikannya sebuah nama, yaitu「リムル」”Rimuru”, dan リムル Rimuru juga memberikan nama untuk dirinya sendiri dan Veldora, yaitu 「テンペスト」”Tempesuto” (Tempest). Nama mereka berdua pun menjadi 「リムルテンペスト」”Rimuru Tempesuto” (Tempest) dan 「ヴェルドラテンペスト」” Verudora Tempesuto” (Veldora Tempest).\n" +
                "Setelah keluar dari gua tersebut リムル Rimuru pun memulai pertualangannya dan melalui banyak hal, mulai dari bertemu dengan berbagai manusia, ras monster yang menjadi temannya , dia juga bertemu dengan seorang perempuan yang di panggil ke isekasi bernama  シズ yang juga berasal dari Jepang sama sepertinya, membangun kota monster, menambah rekannya, melawan musuh, dan bertemu dengan yang disebut dengan raja iblis di isekai tersebut.",

        "Seorang mahasiswa bernama 岩谷尚文 Iwatani Naofumi yang mengambil sebuah buku yang tentang Empat Pahlawan di perpustakaan, tiba-tiba dipanggil ke dunia lain ke sebuah negara bernama メルロマルク Meruromaruku (Melromarc) sebagai「盾の勇者」”Pahlawan Perisai”.\n" +
                "Di sana dia juga bertemu dengan tiga orang lain yang dipanggil ke メルロマルク Meruromaruku (Melromarc) tersebut bersamaan dengannya sebagai pahlawan yaitu 剣の勇者天木錬  Pahlawan pedang Amaki Ren, 弓の勇者川澄樹  Pahlawan Panah Kawasumi Itsuki, 槍の勇者北村元康 Pahlawan Tombak Kitamura Motoyasu, yang di mana tiga orang tersebut juga berasal dari Jepang sama sepertinya. Mereka berempat dilengkapi dengan senjata legendaris mereka ketika dipanggil.\n" +
                "Mereka berempat diperintahkan oleh raja untuk melindungi dunia dari gelombang monster yang muncul dari celah dimensi. Untuk mengasah dan memperkuat senjata dan kemampuan mereka, mereka akan bepergian bersama rekan. Karena perisai yang sama-sekali tidak populer karena tidak bisa menyerang, 尚文 Naofumi sebagai 盾の勇者 Pahlawan Perisai pun hanya memiliki satu rekan saja, yaitu seorang wanita bernama マイン Main (Myne), akan tetapi マイン Main (Myne) tidak hanya mengkhianati 尚文 Naofumi dan mencuri semua hartanya, tetapi juga menuduh 尚文 Naofumi memperkosanya.\n" +
                "尚文 Naofumi yang kehilangan ketenaran, uang, kredibilitas sebagai pahlawan, dan putus asa dengan orang-orang di dunia lain, dan pikirannya yang mulai dipenuhi dengan balas dendam dan kebencian pun memutuskan untuk melakukan perjalanan tanpa bekerja sama dengan manusia. Dia membeli seorang gadis setengah manusia, ラフタリア Rafutaria (Raphtalia), dari seorang pedagang budak untuk berperan sebagai penyerang dalam kelompoknya dan mengobatinya, lalu keduanya memulai perjalanan mereka bersama. 尚文 Naofumi dan ラフタリア Rafutaria (Raphtalia) yang awalnya memiliki hubungan tuan-pelayan berdasarkan kontrak, mengembangkan hubungan saling percaya saat mereka melanjutkan perjalanan.\n" +
                "Setelah menghadapi gelombang pertama setelah dia dipanggil (kedua kalinya untuk メルロマルク Meruromaruku (Melromarc)), 尚文 Naofumi, yang membantu orang-orang yang terkena gelombang, menambahkan フィーロ Fiiro (Filo) monster berwujud burung dari ras フィロリアル Firoriaru (Filolial) ke dalam kelompoknya. Dia menjadi pedagang sambil menyembunyikan identitas aslinya.\n" +
                "Dalam gelombang yang muncul kembali, dia bertabrakan dengan wanita bernama グラス Gurasu (Glass), merupakan anggota dari kelompok yang menentang Pahlawan. 尚文 Naofumi  yang berkali-kali, di ganggu dan di diskriminasi oleh メルロマルク Meruromaruku (Melromarc), selama dia berdagang dan selalu membantu orang-orang, penilaian  yang diberikan kepada 尚文 Naofumi  pun mulai menjadi berbalik dengan penilaian pada pahlawan lainnya pada tingkat rakyat.\n" +
                "Saat reputasi 尚文 Naofumi mulai naik, kali ini kelompok agama di メルロマルク Meruromaruku (Melromarc), yang awalnya menolak Pahlawan Perisai dan Memuja tiga pahlawan lainnya, ingin melenyapkan ke 4 pahlawan tersebut."

    )

    private val selengkapnyaLN = arrayOf(

        "https://ja.wikipedia.org/wiki/お隣の天使様にいつの間にか駄目人間にされていた件",

        "https://ja.wikipedia.org/wiki/青春ブタ野郎シリーズ",

        "https://ja.wikipedia.org/wiki/やはり俺の青春ラブコメはまちがっている。",

        "https://ja.wikipedia.org/wiki/Re:ゼロから始める異世界生活",

        "https://ja.wikipedia.org/wiki/ぼくたちのリメイク",

        "https://ja.wikipedia.org/wiki/ようこそ実力至上主義の教室へ",

        "https://ja.wikipedia.org/wiki/ダンジョンに出会いを求めるのは間違っているだろうか",

        "https://ja.wikipedia.org/wiki/ひげを剃る。そして女子高生を拾う。",

        "https://ja.wikipedia.org/wiki/ようこそ実力至上主義の教室へ",

        "https://ja.wikipedia.org/wiki/デート・ア・ライブ",

        "https://ja.wikipedia.org/wiki/転生したらスライムだった件",

        "https://ja.wikipedia.org/wiki/盾の勇者の成り上がり"

    )

    private val tokoresmiLN = arrayOf(

        "https://ga.sbcr.jp/sp/otonari/index.html",

        "https://dengekibunko.jp/product/aobuta/",

        "https://www.shogakukan.co.jp/books/volume/26762",

        "https://mfbunkoj.jp/product/rezero/",

        "https://mfbunkoj.jp/special/remake/",

        "http://youkosozitsuryoku.com",

        "https://ga.sbcr.jp/sp/danmachi/books.html",

        "https://sneakerbunko.jp/product/higewosoru/321709000487.html",

        "https://mfbunkoj.jp/product/keyword/ようこそ実力至上主義の教室へ%202年生編/",

        "https://fantasiabunko.jp/product/201103date/",

        "https://www.amazon.co.jp/伏瀬/e/B00MLNTAFU/ref=aufs_dp_fta_dsk",

        "https://mfbooks.jp/product/tatenoyusha/"

    )

    val listData : ArrayList<LightNovel>
        get() {
            val list = arrayListOf<LightNovel>()
            for (position in judulLN.indices) {
                val ln = LightNovel()
                ln.judul = judulLN[position]
                ln.keterangan = infoLN[position]
                ln.sampul = sampulLN[position]
                ln.namapenulisilustrator = penulis_ilustratorLN[position]
                ln.terbit = terbitLN[position]
                ln.penerbit = penerbitLN[position]
                ln.genre = genreLN[position]
                ln.volume = volumeLN[position]
                ln.deskripsi = deskripsiLN[position]
                ln.plot = plotLN[position]
                ln.selengkapnya = selengkapnyaLN[position]
                ln.tokoresmi = tokoresmiLN[position]
                list.add(ln)
            }
            return  list
        }
}