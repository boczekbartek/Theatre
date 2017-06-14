/**
 * Created by bartek on 14.06.17.
 */
import React from 'react'
import EmployeeList from './EmployeeList'
const client = require('../../client');

// tag::app[]
export default class EmployeeDownloader extends React.Component {

    constructor(props) {
        super(props);
        this.state = {employees: []};
    }

    componentDidMount() {
        client({method: 'GET', path: '/api/employees'}).done(response => {
            console.log(response.entity._embedded.employees);
            this.setState({employees: response.entity._embedded.employees});
        });
    }

    render() {
        console.log(this.state);
        return (
            <div>
                <EmployeeList employees={this.state.employees}/>
            </div>
        )
    }
}
// end::app[]