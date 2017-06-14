/**
 * Created by bartek on 14.06.17.
 */
import React from 'react'
import ProductionList from './ProductionList'
const client = require('../../client');

// tag::app[]
export default class ProductionDownloader extends React.Component {

    constructor(props) {
        super(props);
        this.state = {productions: []};
    }

    componentDidMount() {
        client({method: 'GET', path: '/api/productions'}).done(response => {
            this.setState({productions: response.entity._embedded.productions});
        });
    }


    render() {
        console.log(this.state);
        return (
            <div>
                <ProductionList productions={this.state.productions}/>
            </div>
        )
    }
}
// end::app[]