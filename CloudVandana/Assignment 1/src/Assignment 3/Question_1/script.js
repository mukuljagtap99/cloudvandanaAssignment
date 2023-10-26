let displayValue = '';
let currentOperator = '';
let prevValue = null;

function appendToDisplay(value) {
    if (displayValue === '0' && value !== '.') {
        displayValue = value;
    } else {
        displayValue += value;
    }
    updateDisplay();
}

function updateDisplay() {
    document.getElementById('display').innerText = displayValue;
}

function clearDisplay() {
    displayValue = '0';
    currentOperator = '';
    prevValue = null;
    updateDisplay();
}

function calculateResult() {
    if (currentOperator !== '') {
        const currentValue = parseFloat(displayValue);

        switch (currentOperator) {
            case '+':
                displayValue = (prevValue + currentValue).toString();
                break;
            case '-':
                displayValue = (prevValue - currentValue).toString();
                break;
            case '*':
                displayValue = (prevValue * currentValue).toString();
                break;
            case '/':
                if (currentValue !== 0) {
                    displayValue = (prevValue / currentValue).toString();
                } else {
                    displayValue = 'Error';
                }
                break;
        }

        currentOperator = '';
        prevValue = null;
        updateDisplay();
    }
}

function setOperator(operator) {
    if (currentOperator === '') {
        prevValue = parseFloat(displayValue);
        displayValue = '0';
        currentOperator = operator;
        updateDisplay();
    }
}
