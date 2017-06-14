
import React from 'react'
import Production from "./Production"
import ProductionInfoList from "./ProductionInfoList"
const client = require('../../client');

// tag::production-list[]
export default class ProductionList extends React.Component {
    // constructor(){
    //     super();
    //     this.state = {venue : []}
    // }
    //
    // handler(link){
    //     console.log(link)
    //     client({method: 'GET', path: link.href.replace("http://localhost:8080","")}).done(response => {
    //         console.log({res: response});
    //         this.setState({venue: response.entity._embedded._links.venue}).bind(this);
    //     });
    //
    //
    // }


    render() {
        console.log(this.props.productions);
        var productions = this.props.productions.map(production =>
            <Production production={production}/>
        );

        return (
         <div>
            <table class="table-bordered">
                <tbody>
                <tr>
                    <th>Tytuł</th>
                    <th>Twórca</th>
                    <th>Opis</th>
                    <th></th>
                </tr>
                {productions}
                </tbody>
            </table>
        {/*{performances}*/}
         </div>
        )
    }
}
// end::production-list[]