package eu.tutorial.mywishlistapp

import android.content.Context
import androidx.room.Room
import eu.tutorial.mywishlistapp.data.WishDatabase
import eu.tutorial.mywishlistapp.data.WishRepository

object Graph {
    lateinit var database: WishDatabase

    val wishRepository by lazy {
        WishRepository(wishDao = database.wishDao())
    }

    fun provide(context: Context){
        database = Room.databaseBuilder(context, WishDatabase::class.java, "wishlist.db").build()
    }
}