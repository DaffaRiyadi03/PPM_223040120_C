class IndeksNilaiMatkul {

    fun hitungIndeks(nilai: Int?): String {
        if (nilai == null) {
            return "Nilai harus diisi"
        }

        return when (nilai) {
            in 80..100 -> "A"
            in 70..79 -> "AB"
            in 60..69 -> "B" //Perbaikan: sebelumnya 60-89 seharusnya 60-69
            in 50..59 -> "BC"
            in 40..49 -> "C"
            in 30..39 -> "D"
            in 0..29 -> "E"
            else -> "Nilai di luar jangkauan"
        }
    }
}

fun main(args: Array<String>) {
    val indeksNilai = IndeksNilaiMatkul()

    println("No\tInput\tOutput")

    for (i in args.indices) {
        val nilaiString = args[i]
        val nilai = nilaiString.toIntOrNull() // Menggunakan toIntOrNull untuk menangani input non-angka

        val indeks = indeksNilai.hitungIndeks(nilai)

        println("${i + 1}\t${nilaiString}\t${indeks}")
    }

    // Handle case where no arguments are provided
    if (args.isEmpty()) {
        println("1\t{kosong}\tNilai harus diisi")
    }
}