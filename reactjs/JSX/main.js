// const element=<h1>This is JSX</h1>
const name = "abcd";
const element = <h1>{name}</h1>

function Welcome(props) {
    return (
        <div>
        <h1 style={{color:'red'}}>{props.name}</h1>
       {/*  <button onClick={()=>alert('Button')}>Click</button> */}
       <button onClick={alert.bind(this,'This is Button')}>Click</button>
        </div>
    )
}

class Message extends React.Component{
    constructor(props){
        super(props);
        this.state={
            name:'Geetha'
        }
        this.changeMessage=this.changeMessage.bind(this);
       /*  this.clickLink=this.clickLink.bind(this); //point 1:use arrow function to avoid making use of bind    */
    }
    render(){
        console.log("Rendering");
        return(
            <div>
                <h1 style={{color:'green'}}>{this.state.name}</h1>
                <h2>ABCDEFGHIJKLMNOP</h2>
                <button onClick={this.changeMessage}>Change Message</button>
                <a href="https://www.google.com" onClick={this.clickLink}>Link</a>
            </div>
        )
    }
    changeMessage(){
        console.log("Change Message Method");
        //this.state.name="ansb";//setState always call render method
        this.setState({
            name:'JAYA'
        })
    }
    clickLink=(e)=>{
        e.preventDefault();
    }
   /*  clickLink(event){//point 1
        event.preventDefault();//javascript provides synthetic event to prevent the default behaviour
    } */
}
// ReactDOM.render(element, document.getElementById('app'));
//ReactDOM.render(<Welcome  name="KALPANA" />, document.getElementById('app'));
ReactDOM.render(<Message />, document.getElementById('app'));

