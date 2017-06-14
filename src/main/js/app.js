'use strict';

// tag::vars[]
import React from 'react';
import ReactDOM from 'react-dom';
import {Router, Route, IndexRoute, hashHistory} from 'react-router';


import Layout from "./Components/Layout"
import EmployeeDownloader from "./Components/Employee/EmployeeDownloader"
import ProductionDownloader from "./Components/Production/ProductionDownloader"

const app = document.getElementById('react')

// tag::render[]
ReactDOM.render(
    <Router history={hashHistory}>
        <Route path="/" component={Layout}>
            <IndexRoute component={ProductionDownloader}></IndexRoute>
            <Route path="archives" name="archives" component={EmployeeDownloader}></Route>

        </Route>
    </Router>,app
);
// end::render[]

