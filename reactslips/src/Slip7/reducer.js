export const initialState = []

const toDoReducer = (state, action) => {
    switch (action.type) {
        case 'ADD_TASK':
            return [...state, action.payload]
        case 'DELETE_TASK':
            state.splice(action.payload, 1)
            console.log(state)
            return [...state]
        default:
            return state
    }
}

export default toDoReducer;