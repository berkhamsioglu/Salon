import './App.css';
import LoadingIndicatorComponent from "./common/loader/loading-indicator-component";
import AppNotificationComponent from "./common/notifications/app-notification-component";
import ChooseService from "./choose-service-slot/ChooseService";

function App() {
  return (
    <div>
      <LoadingIndicatorComponent/>
      <nav className="navbar navbar-dark bg-dark">
      <div className="navbar-brand" style={{ padding: '10px' }}>
        Ar Salon & Day Spa
      </div>
      </nav>
      <main role="main" className="container">
            <div className="padding-container">
                    <ChooseService />
            </div>
        </main>
      <AppNotificationComponent/>     
    </div>
  );
}

export default App;
