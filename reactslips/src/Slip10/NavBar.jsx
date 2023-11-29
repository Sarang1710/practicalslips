import { NavLink, Outlet } from "react-router-dom"

const NavBar = () => {
    return (
        <>
            <ul className="nav justify-content-left">
                <li className="nav-item">
                    <NavLink to="/home" className="nav-link" activeClassName="active">Home</NavLink>
                </li>
                <li className="nav-item">
                    <NavLink to="/about" className="nav-link" activeClassName="active">About</NavLink>
                </li>
            </ul>
            <Outlet />
        </>
    )
}
export default NavBar;