/**
 * Created by bartek on 14.06.17.
 */

import React from 'react'

// tag::production[]
export default class Employee extends React.Component {
    render() {
        console.log(this.props);
        return (

            <tr>
                <td>{this.props.employee.firstname}</td>
                <td>{this.props.employee.lastname}</td>
                <td>{this.props.employee.gender}</td>
                <td>
                    <button class="btn-default">Zobacz przedstawienia</button>
                </td>
            </tr>
        )
    }
}
// end::production[]