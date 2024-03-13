package eu.tutorial.mywishlistapp.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "wish-table")
data class Wish(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0L,
    @ColumnInfo(name="wish-title")
    val title: String = "",
    @ColumnInfo(name="wish-description")
    val description: String =""
)


object DummyWish{
    val wishlist = listOf(Wish(
        title = "Android",
        description = "Oppo"
    ),
        Wish(
            title = "Tablet",
            description = "Samsung"
        ),
        Wish(
            title = "TV",
            description = "Sony"
        )
        )
}