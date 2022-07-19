    package com.example.listadecontatos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.appcompat.widget.LinearLayoutCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.listadecontatos.databinding.ActivityMainBinding
import com.example.listadecontatos.databinding.ItemListaBinding
import com.google.android.material.snackbar.Snackbar

    /*
    • Para esta atividade vamos criar um app que exibe
    uma lista de contato, com os seguintes requisitos
    • Criar uma data class chamada ContactInfo que deverá
    conter
    • Uma string name
    • Uma string phone
    • Crie uma activity com:
    • Uma lista de ContactInfo com valores fixos. Quanto mais
    valores melhor, para podermos ver a lista rolando
    • Uma RecycleView aonde vamos exibir a lista de contatos
     */

class MainActivity : AppCompatActivity(), ListaContatosAdapter.ListAdapterListener {

    private lateinit var binding: ActivityMainBinding
    private var itemList: MutableList<ContactInfo> = mutableListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.hide()

        val listView = binding.listaContatos

        createMockData()

        listView.layoutManager = LinearLayoutManager(this)

        listView.adapter = ListaContatosAdapter(itemList, this)




    }

    fun createMockData(){
        itemList.add(ContactInfo("André", "(92)99999-9991"))
        itemList.add(ContactInfo("Luiz", "(92)99999-9992"))
        itemList.add(ContactInfo("Jéssica", "(92)99999-9993"))
        itemList.add(ContactInfo("Maria", "(92)99999-9994"))
        itemList.add(ContactInfo("Recquel", "(92)99999-9995"))
        itemList.add(ContactInfo("Matheus", "(92)99999-9996"))
        itemList.add(ContactInfo("Gabriel", "(92)99999-9997"))
        itemList.add(ContactInfo("Eduarda", "(92)99999-9998"))
        itemList.add(ContactInfo("Edna", "(92)99999-9999"))
        itemList.add(ContactInfo("Fabio", "(92)99999-9912"))
        itemList.add(ContactInfo("Jheniffer", "(92)99999-9935"))
        itemList.add(ContactInfo("Júlio", "(92)99999-9971"))
        itemList.add(ContactInfo("Marjory", "(92)99999-9915"))
        itemList.add(ContactInfo("Vitória", "(92)99999-9963"))
        itemList.add(ContactInfo("Ayrton", "(92)99999-9982"))
        itemList.add(ContactInfo("Luke", "(92)99999-9986"))
        itemList.add(ContactInfo("Ana", "(92)99999-9949"))
        itemList.add(ContactInfo("Anakin", "(92)99999-9935"))
        itemList.add(ContactInfo("Gandalf", "(92)99999-9956"))
        itemList.add(ContactInfo("Galadriel", "(92)99999-9939"))
        itemList.add(ContactInfo("Edward Elrich", "(92)99999-9936"))
        itemList.add(ContactInfo("Alfonse", "(92)99999-9934"))
        itemList.add(ContactInfo("Winry", "(92)99999-9911"))
        itemList.add(ContactInfo("Gus", "(92)99999-9914"))
        itemList.add(ContactInfo("Yoham", "(92)99999-9918"))
        itemList.add(ContactInfo("Tenma", "(92)99999-9982"))
    }



    override fun onItemClicked(content: String) {
        Snackbar.make(binding.root, content, Snackbar.LENGTH_SHORT).show()
    }
}