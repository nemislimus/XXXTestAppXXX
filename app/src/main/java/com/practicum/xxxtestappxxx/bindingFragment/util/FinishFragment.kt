package com.practicum.xxxtestappxxx.bindingFragment.util

import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.core.view.MenuProvider
import androidx.viewbinding.ViewBinding
import com.practicum.xxxtestappxxx.R

abstract class FinishFragment<T : ViewBinding> : BindingFragment<T>(), MenuProvider {

    /** View Toolbar, в которую будем заливать меню
     * Меню, которую будет заливаться должно быть добалено в res/menu
     * для отображения в виде икнонки, у пункта меню нужно устроновить
     * свойство  app:showAsAction='ifRoom'
     **/
    abstract fun getToolbarPanel(): Toolbar

    /** Действие на нажатие на кнопку фильтр в меню
     * Дейтсвие определяем в наследнике**/
    abstract fun filterCmdOnClick(): Unit

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        super.onViewCreated(view, savedInstanceState)

        //Цепляем наш менюпровайдер к активити
        requireActivity().addMenuProvider(this, viewLifecycleOwner)
        (requireActivity() as AppCompatActivity).setSupportActionBar(getToolbarPanel())

    }

    override fun onCreateMenu(menu: Menu, menuInflater: MenuInflater) {
        //Заливаем в наш toolbar указанное здесь меню
        // При этом не важно, какое указано в самой разметке layout,
        // и указано ли.
        // Все равно будет заполнено указаное здесь
        menuInflater.inflate(R.menu.filter_menu, menu)
    }

    override fun onMenuItemSelected(menuItem: MenuItem): Boolean {
        //Нажали на команду с id пункта меню фильтра
        if (menuItem.itemId == R.id.id_filter_cmd) {
            filterCmdOnClick()
        }
        return true
    }

}