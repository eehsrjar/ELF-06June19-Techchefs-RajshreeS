import React, { Component } from 'react'
export default class TodoItems extends Component {
    createTasks = item => {
        return (
          <li key={item.key}>
            {item.text}<button className="delete" onClick={() => this.props.deleteItem(item.key)}>X</button>
          </li>
        )
      }
    
  render() {
    const todoEntries = this.props.entries
    const listItems = todoEntries.map(this.createTasks)
    return <ul className="theList">{listItems}</ul>
  }
}
//export default TodoItems