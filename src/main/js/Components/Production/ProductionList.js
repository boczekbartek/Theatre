
import React from 'react'
import Production from "./Production"


// tag::production-list[]
export default class ProductionList extends React.Component {
    render() {
        console.log(this.props.productions);
        var productions = this.props.productions.map(production =>
            <Production production={production}/>
        );
        return (
            <table>
                <tbody>
                <tr>
                    <th>Name</th>
                    <th>Playwright</th>
                    <th>Description</th>
                </tr>
                {productions}
                </tbody>
            </table>
        )
    }
}
// end::production-list[]