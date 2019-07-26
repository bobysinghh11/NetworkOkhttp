package com.stuffshuf.networkokhttp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.view.menu.MenuView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.todo_layout.view.*


class TodoAdapter(private val todos:List<Todo>): RecyclerView.Adapter<TodoViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TodoViewHolder {
        val li = parent.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val itemView = li.inflate(R.layout.todo_layout,parent,false)
        return TodoViewHolder(itemView)
    }

    override fun getItemCount(): Int {

        todos.size
        return 0
    }

    override fun onBindViewHolder(holder: TodoViewHolder, position: Int) {

        val todo=todos[position]
        holder.itemView.userid.text=todo.userId.toString()
        holder.itemView.tvid.text=todo.id.toString()
        holder.itemView.title.text=todo.title
        holder.itemView.complete.text=todo.completed




    }
}

class TodoViewHolder(itemView: View):RecyclerView.ViewHolder(itemView)