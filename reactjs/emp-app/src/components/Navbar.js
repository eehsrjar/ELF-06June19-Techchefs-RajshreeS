import React from 'react';
import { BrowserRouter as Router, Route, Link } from 'react-router-dom';
import CreateAccount from './CreateAccount';
import ViewAccounts from './ViewAccounts';

export default function Navbar(props) {
    return (
        <Router>
            <nav className="navbar navbar-expand-lg navbar-light bg-light">
                <h1 className="navbar-brand" href="#">Employee</h1>
                <button className="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                    <span className="navbar-toggler-icon"></span>
                </button>

                <div className="collapse navbar-collapse" id="navbarSupportedContent">
                    <ul className="navbar-nav mr-auto">
                        <li className="nav-item active">
                            <Link className="nav-link" to="/">Create Account <span className="sr-only">(current)</span></Link>
                        </li>
                        <li className="nav-item">
                            <Link className="nav-link" to="/viewaccounts">View Accounts</Link>
                        </li>
                    </ul>
                </div>
            </nav>
            <Route exact path='/' component={CreateAccount}></Route>
            <Route path='/viewaccounts' component={ViewAccounts}></Route>
        </Router>
    )
}
