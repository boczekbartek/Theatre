
import React from 'react'
import Employee from "./Employee"


// tag::production-list[]
export default class EmployeeList extends React.Component {
    constructor(){
        super();
        this.state = {details : []}
    }

    render() {
        console.log(this.props.employees);
        var employees = this.props.employees.map(employee =>
            <Employee employee={employee}/>
        );
        return (<div>
            <table class="table-bordered">
                <tbody>
                <tr>
                    <th>Imię</th>
                    <th>Nazwisko</th>
                    <th>Płeć</th>
                    <th></th>
                </tr>
                {employees}
                </tbody>
            </table>
            <div class="row">{Articles}</div>
        </div>
        )
    }
}
// end::production-list[]