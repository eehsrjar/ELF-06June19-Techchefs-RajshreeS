'use strict';
class LifeCycle extends React.Component{
    constructor(props){
        super(props);
        console.log('Constructor');
        this.state={
            name : 'Sundari',
            checked:false
        }
    }
    static getDerivedStateFromProps(){
        console.log('getDerivedStateFromProps lifecycle');
        return null;
       //return {name:'Sundara'}
    }
    render(){
        console.log('Render Lifecycle');
        if(this.state.checked){
        return (
           
            <div>
            <h1>{this.state.name}</h1>
            <button onClick={this.changeName.bind(this)}>Change Name</button>
            </div>
        )
        }
        return <Child/>
    }
    changeName(){
        this.setState({
            name:'Dinga'
        })
    }
    componentDidMount(){
        console.log('Component Did Mount Lifecycle');
    }
    shouldComponentUpdate(){
        console.log('should Component Update Lifecycle');
        return true;
    }
    getSnapshotBeforeUpdate(){
        console.log('getSnapShotBeforeUpdate Lifecycle');
        console.log(this.state.name);
        return {name:'cbn'}
    }
    componentDidUpdate(prevprops,prevstate,snapshot){
        console.log('Component Did Update Lifecycle');
        console.log('Snapshot data',snapshot);
        console.log("Props data",prevprops);
        console.log("State Data",prevstate);
    }
}
class Child extends React.Component{
    constructor(props){
        super(props);
        console.log('Constructor');
        this.state={
            name : 'Neha',
            checked:true
        }
    }
    static getDerivedStateFromProps(){
        console.log('getDerivedStateFromProps Child');
        return null;
       //return {name:'Sundara'}
    }
    render(){
        console.log('Render Child');
        if(this.state.checked){
        return (
           
            <div>
            <h1>{this.state.name}</h1>
            <h1>Child Component</h1>
            <button onClick={this.changeName.bind(this)}>Change Name</button>
            </div>
        )
        }
        return <h1>Checked is false</h1>
    }
    changeName(){
        this.setState({
            name:'Meena'
        })
    }
    componentDidMount(){
        console.log('Component Did Mount Child');
    }
    shouldComponentUpdate(){
        console.log('should Component Update Child');
        return true;
    }
    getSnapshotBeforeUpdate(){
        console.log('getSnapShotBeforeUpdate Child');
        console.log(this.state.name);
        return {name:'cbn'}
    }
    componentDidUpdate(prevprops,prevstate,snapshot){
        console.log('Component Did Update Child');
        console.log('Snapshot data',snapshot);
        console.log("Props data",prevprops);
        console.log("State Data",prevstate);
    }
}
ReactDOM.render(<div><LifeCycle/></div>,document.getElementById('app'));