package unhas.ac.id.crudtodolist

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import unhas.ac.id.crudtodolist.db.SubscriberRepository
import java.lang.IllegalArgumentException

class SubscriberViewModelFactory(private val repository: SubscriberRepository):ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(SubscriberViewModel::class.java)){
             return SubscriberViewModel(repository) as T
        }

            throw IllegalArgumentException("Unknow view Model class")
    }
}