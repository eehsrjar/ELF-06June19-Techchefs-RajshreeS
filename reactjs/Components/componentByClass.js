class Header extends React.Component{
    constructor(props){
        super(props);
        console.log(this.props);
    }
    render(){
        return React.createElement('h1',null,'Header');
    }
}
class Footer extends React.Component{
    render(){
        return React.createElement('h1',null,'Footer');
    }
}
class Content extends React.Component{
    constructor(props){
        super(props);        
    }
    render(){
        return React.createElement('ul',{className:'green'},
        this.props.item.map((val,index)=>{
            return React.createElement('li',{key:index},val)
        }));
    }
}
const items=['kite','Ballon','Candles'];
const header=React.createElement(Header,{item:['bag']});
const footer=React.createElement(Footer);
const content=React.createElement(Content,{item:items});
const myApp=React.createElement('div',null,header,content,footer);
ReactDOM.render(myApp,document.getElementById('app'));