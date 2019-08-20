import React,{Component} from 'react';
import TodoList from './components/todolist'
import './App.css';
import TodoItems from './components/todoItems';
import BootstrapComponent from './components/BootstrapComponent';
import HeaderComponent from './components/header';

class App extends Component{
  inputElement=React.createRef()
  constructor() {
    super()
    this.state = {
      items: [],
      currentItem: {text:'', key:''},
      color:'green'
    }
    //this.deleteItem=this.deleteItem.bind(this); without arrow fun then use binding
  }
  handleInput = e => {
    const itemText = e.target.value
    const currentItem = { text: itemText, key: Date.now() }
    this.setState({
      currentItem,
    })
    this.setState({color:'red'})
    if(itemText===''){
      this.setState({color:'green'})
    }
    console.log('Hello Input');
  }
  addItem = e => {
    e.preventDefault()
    const newItem = this.state.currentItem
    if (newItem.text !== '') {
      console.log(newItem)
      const items = [...this.state.items, newItem]
      this.setState({
        items: items,
        currentItem: { text: '', key: '' },
        color:'green'
      })

    }
    console.log('Hello Add Item')
  }
  //if using simple function other than arrow fun manually bind in constructor
  //delete(key){}
  deleteItem = key => {
    const filteredItems = this.state.items.filter(item => {
      return item.key !== key
    })
    this.setState({
      items: filteredItems,
    })
  }
  render() {
    return (
      <div className="App">
        <HeaderComponent/>
        <h1> Todo List Task</h1>
        <TodoList 
          addItem={this.addItem}
          inputElement={this.inputElement}
          handleInput={this.handleInput}
          currentItem={this.state.currentItem}
          color={this.state.color}
        />
        <TodoItems entries={this.state.items}deleteItem={this.deleteItem}/>
        <BootstrapComponent/>
       
      </div>// Implicit bind fun if not arrow fun i.e.this.deleteItem.bind(this)
    )
  }
}
export default App;
