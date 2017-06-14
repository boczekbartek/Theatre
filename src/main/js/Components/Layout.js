/**
 * Created by bartek on 14.06.17.
 */
import React from "react";
import { Link } from "react-router";

import Footer from "./Nav/Footer";
import Nav from "./Nav/Nav";

export default class Layout extends React.Component {
    render() {
        const { location } = this.props;
        const containerStyle = {
            marginTop: "60px"
        };
        console.log("layout");
        return (
            <div>

                <Nav location={location} />

                <div class="container" style={containerStyle}>
                    <div class="row">
                        <div class="col-lg-12">
                            <h1>Teatr Wubedowców</h1>
                            <div>
                            {this.props.children}
                            </div>
                        </div>
                    </div>
                    <Footer/>
                </div>
            </div>

        );
    }
}