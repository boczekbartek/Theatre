/**
 * Created by bartek on 14.06.17.
 */

import React from 'react'

// tag::production[]
export default class Production extends React.Component {
    // _handle(){
    //     this.props.handler(this.props.production._links.performances)
    // }
    constructor(props) {
        super(props);
        this.handleDelete = this.handleDelete.bind(this);
    }

    handleDelete() {
        this.props.onDelete(this.props.employee);
    }
    render() {
        console.log(this.props);
        return (

            <tr>
                <td>{this.props.production.name}</td>
                <td>{this.props.production.playwright}</td>
                <td>{this.props.production.description}</td>
                <td>
                    {/*<button class="btn-default" onClick={this._handle.bind(this)}>Szczegóły</button>*/}
                    <button class="btn-danger" onClick={this.handleDelete}>Delete</button>
                </td>
            </tr>
        )
    }
}
// end::production[]