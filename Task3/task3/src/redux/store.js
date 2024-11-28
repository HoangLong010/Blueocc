import { createStore, applyMiddleware } from 'redux';
import { thunk } from 'redux-thunk'; // Sử dụng import có tên
import rootReducer from './reducers';

const store = createStore(rootReducer, applyMiddleware(thunk));

export default store;
