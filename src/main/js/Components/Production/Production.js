/**
 * Created by bartek on 14.06.17.
 */

import React from 'react'

// tag::production[]
export default class Production extends React.Component {
    render() {
        console.log(this.props);
        return (

            <tr>
                <td>{this.props.production.name}</td>
                <td>{this.props.production.playwright}</td>
                <td>{this.props.production.description}</td>
                <td>
                    <button class="btn-default">Szczegoóły</button>
                </td>
            </tr>
        )
    }
}
// end::production[]