define(["big.js"], (__WEBPACK_EXTERNAL_MODULE_big_js__) => { return /******/ (() => { // webpackBootstrap
/******/ 	"use strict";
/******/ 	var __webpack_modules__ = ({

/***/ "../../../../../../Users/TKA/Documents/Mendix/QuizApp/javascriptsource/nanoflowcommons/actions/HideProgress.js":
/*!*********************************************************************************************************************!*\
  !*** ../../../../../../Users/TKA/Documents/Mendix/QuizApp/javascriptsource/nanoflowcommons/actions/HideProgress.js ***!
  \*********************************************************************************************************************/
/***/ ((__unused_webpack_module, __webpack_exports__, __webpack_require__) => {

__webpack_require__.r(__webpack_exports__);
/* harmony export */ __webpack_require__.d(__webpack_exports__, {
/* harmony export */   HideProgress: () => (/* binding */ HideProgress)
/* harmony export */ });
/* harmony import */ var big_js__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! big.js */ "big.js");
/* harmony import */ var big_js__WEBPACK_IMPORTED_MODULE_0___default = /*#__PURE__*/__webpack_require__.n(big_js__WEBPACK_IMPORTED_MODULE_0__);
// This file was generated by Mendix Studio Pro.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.


// BEGIN EXTRA CODE
// END EXTRA CODE

/**
 * Hides default progress bar
 * @param {Big} identifier - Identifier of ui which should be hidden. This param is required
 * @returns {Promise.<void>}
 */
async function HideProgress(identifier) {
  // BEGIN USER CODE
  if (identifier == null) {
    return Promise.reject(new Error("Input parameter 'Identifier' is required"));
  }
  mx.ui.hideProgress(Number(identifier));
  return Promise.resolve();
  // END USER CODE
}

/***/ }),

/***/ "../../../../../../Users/TKA/Documents/Mendix/QuizApp/javascriptsource/nanoflowcommons/actions/ShowProgress.js":
/*!*********************************************************************************************************************!*\
  !*** ../../../../../../Users/TKA/Documents/Mendix/QuizApp/javascriptsource/nanoflowcommons/actions/ShowProgress.js ***!
  \*********************************************************************************************************************/
/***/ ((__unused_webpack_module, __webpack_exports__, __webpack_require__) => {

__webpack_require__.r(__webpack_exports__);
/* harmony export */ __webpack_require__.d(__webpack_exports__, {
/* harmony export */   ShowProgress: () => (/* binding */ ShowProgress)
/* harmony export */ });
/* harmony import */ var big_js__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! big.js */ "big.js");
/* harmony import */ var big_js__WEBPACK_IMPORTED_MODULE_0___default = /*#__PURE__*/__webpack_require__.n(big_js__WEBPACK_IMPORTED_MODULE_0__);
// This file was generated by Mendix Studio Pro.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.


// BEGIN EXTRA CODE
// END EXTRA CODE

/**
 * Shows default progress bar
 * @param {string} message - The text to show while loading.
 * @param {boolean} blocking - Block the user interface immediately.
 * @returns {Promise.<Big>}
 */
async function ShowProgress(message, blocking) {
  // BEGIN USER CODE
  const id = mx.ui.showProgress(message, blocking);
  if (id !== undefined) {
    return Promise.resolve(new big_js__WEBPACK_IMPORTED_MODULE_0__.Big(id));
  }
  return Promise.reject(new Error("Could not open the loading dialog"));
  // END USER CODE
}

/***/ }),

/***/ "big.js":
/*!*************************!*\
  !*** external "big.js" ***!
  \*************************/
/***/ ((module) => {

module.exports = __WEBPACK_EXTERNAL_MODULE_big_js__;

/***/ })

/******/ 	});
/************************************************************************/
/******/ 	// The module cache
/******/ 	var __webpack_module_cache__ = {};
/******/ 	
/******/ 	// The require function
/******/ 	function __webpack_require__(moduleId) {
/******/ 		// Check if module is in cache
/******/ 		var cachedModule = __webpack_module_cache__[moduleId];
/******/ 		if (cachedModule !== undefined) {
/******/ 			return cachedModule.exports;
/******/ 		}
/******/ 		// Create a new module (and put it into the cache)
/******/ 		var module = __webpack_module_cache__[moduleId] = {
/******/ 			// no module.id needed
/******/ 			// no module.loaded needed
/******/ 			exports: {}
/******/ 		};
/******/ 	
/******/ 		// Execute the module function
/******/ 		__webpack_modules__[moduleId](module, module.exports, __webpack_require__);
/******/ 	
/******/ 		// Return the exports of the module
/******/ 		return module.exports;
/******/ 	}
/******/ 	
/************************************************************************/
/******/ 	/* webpack/runtime/compat get default export */
/******/ 	(() => {
/******/ 		// getDefaultExport function for compatibility with non-harmony modules
/******/ 		__webpack_require__.n = (module) => {
/******/ 			var getter = module && module.__esModule ?
/******/ 				() => (module['default']) :
/******/ 				() => (module);
/******/ 			__webpack_require__.d(getter, { a: getter });
/******/ 			return getter;
/******/ 		};
/******/ 	})();
/******/ 	
/******/ 	/* webpack/runtime/define property getters */
/******/ 	(() => {
/******/ 		// define getter functions for harmony exports
/******/ 		__webpack_require__.d = (exports, definition) => {
/******/ 			for(var key in definition) {
/******/ 				if(__webpack_require__.o(definition, key) && !__webpack_require__.o(exports, key)) {
/******/ 					Object.defineProperty(exports, key, { enumerable: true, get: definition[key] });
/******/ 				}
/******/ 			}
/******/ 		};
/******/ 	})();
/******/ 	
/******/ 	/* webpack/runtime/hasOwnProperty shorthand */
/******/ 	(() => {
/******/ 		__webpack_require__.o = (obj, prop) => (Object.prototype.hasOwnProperty.call(obj, prop))
/******/ 	})();
/******/ 	
/******/ 	/* webpack/runtime/make namespace object */
/******/ 	(() => {
/******/ 		// define __esModule on exports
/******/ 		__webpack_require__.r = (exports) => {
/******/ 			if(typeof Symbol !== 'undefined' && Symbol.toStringTag) {
/******/ 				Object.defineProperty(exports, Symbol.toStringTag, { value: 'Module' });
/******/ 			}
/******/ 			Object.defineProperty(exports, '__esModule', { value: true });
/******/ 		};
/******/ 	})();
/******/ 	
/************************************************************************/
var __webpack_exports__ = {};
// This entry need to be wrapped in an IIFE because it need to be isolated against other modules in the chunk.
(() => {
/*!****************************************************************************************!*\
  !*** ../../../../../../Users/TKA/Documents/Mendix/QuizApp/deployment/tmp/jsactions.js ***!
  \****************************************************************************************/
__webpack_require__.r(__webpack_exports__);
/* harmony export */ __webpack_require__.d(__webpack_exports__, {
/* harmony export */   NanoflowCommons$HideProgress: () => (/* binding */ NanoflowCommons$HideProgress),
/* harmony export */   NanoflowCommons$ShowProgress: () => (/* binding */ NanoflowCommons$ShowProgress)
/* harmony export */ });
const NanoflowCommons$ShowProgress = async () => (await Promise.resolve(/*! import() */).then(__webpack_require__.bind(__webpack_require__, /*! ../../../../../../Users/TKA/Documents/Mendix/QuizApp/javascriptsource/nanoflowcommons/actions/ShowProgress */ "../../../../../../Users/TKA/Documents/Mendix/QuizApp/javascriptsource/nanoflowcommons/actions/ShowProgress.js"))).ShowProgress;
const NanoflowCommons$HideProgress = async () => (await Promise.resolve(/*! import() */).then(__webpack_require__.bind(__webpack_require__, /*! ../../../../../../Users/TKA/Documents/Mendix/QuizApp/javascriptsource/nanoflowcommons/actions/HideProgress */ "../../../../../../Users/TKA/Documents/Mendix/QuizApp/javascriptsource/nanoflowcommons/actions/HideProgress.js"))).HideProgress;
})();

/******/ 	return __webpack_exports__;
/******/ })()
;
});;
//# sourceMappingURL=data:application/json;charset=utf-8;base64,eyJ2ZXJzaW9uIjozLCJmaWxlIjoianNhY3Rpb25zLmpzIiwibWFwcGluZ3MiOiI7Ozs7Ozs7Ozs7Ozs7Ozs7QUFBQTtBQUNBO0FBQ0E7QUFDQTtBQUNBO0FBQ0E7QUFDQTtBQUM2Qjs7QUFFN0I7QUFDQTs7QUFFQTtBQUNBO0FBQ0E7QUFDQTtBQUNBO0FBQ08sZUFBZUMsWUFBWSxDQUFDQyxVQUFVLEVBQUU7RUFDOUM7RUFDRyxJQUFJQSxVQUFVLElBQUksSUFBSSxFQUFFO0lBQ3BCLE9BQU9DLE9BQU8sQ0FBQ0MsTUFBTSxDQUFDLElBQUlDLEtBQUssQ0FBQywwQ0FBMEMsQ0FBQyxDQUFDO0VBQ2hGO0VBQ0FDLEVBQUUsQ0FBQ0MsRUFBRSxDQUFDQyxZQUFZLENBQUNDLE1BQU0sQ0FBQ1AsVUFBVSxDQUFDLENBQUM7RUFDdEMsT0FBT0MsT0FBTyxDQUFDTyxPQUFPLEVBQUU7RUFDM0I7QUFDRDs7Ozs7Ozs7Ozs7Ozs7OztBQ3pCQTtBQUNBO0FBQ0E7QUFDQTtBQUNBO0FBQ0E7QUFDQTtBQUM2Qjs7QUFFN0I7QUFDQTs7QUFFQTtBQUNBO0FBQ0E7QUFDQTtBQUNBO0FBQ0E7QUFDTyxlQUFlQyxZQUFZLENBQUNDLE9BQU8sRUFBRUMsUUFBUSxFQUFFO0VBQ3JEO0VBQ0csTUFBTUMsRUFBRSxHQUFHUixFQUFFLENBQUNDLEVBQUUsQ0FBQ1EsWUFBWSxDQUFDSCxPQUFPLEVBQUVDLFFBQVEsQ0FBQztFQUNoRCxJQUFJQyxFQUFFLEtBQUtFLFNBQVMsRUFBRTtJQUNsQixPQUFPYixPQUFPLENBQUNPLE9BQU8sQ0FBQyxJQUFJVix1Q0FBRyxDQUFDYyxFQUFFLENBQUMsQ0FBQztFQUN2QztFQUNBLE9BQU9YLE9BQU8sQ0FBQ0MsTUFBTSxDQUFDLElBQUlDLEtBQUssQ0FBQyxtQ0FBbUMsQ0FBQyxDQUFDO0VBQ3hFO0FBQ0Q7Ozs7Ozs7Ozs7QUMxQkE7Ozs7OztVQ0FBO1VBQ0E7O1VBRUE7VUFDQTtVQUNBO1VBQ0E7VUFDQTtVQUNBO1VBQ0E7VUFDQTtVQUNBO1VBQ0E7VUFDQTtVQUNBO1VBQ0E7O1VBRUE7VUFDQTs7VUFFQTtVQUNBO1VBQ0E7Ozs7O1dDdEJBO1dBQ0E7V0FDQTtXQUNBO1dBQ0E7V0FDQSxpQ0FBaUMsV0FBVztXQUM1QztXQUNBOzs7OztXQ1BBO1dBQ0E7V0FDQTtXQUNBO1dBQ0EseUNBQXlDLHdDQUF3QztXQUNqRjtXQUNBO1dBQ0E7Ozs7O1dDUEE7Ozs7O1dDQUE7V0FDQTtXQUNBO1dBQ0EsdURBQXVELGlCQUFpQjtXQUN4RTtXQUNBLGdEQUFnRCxhQUFhO1dBQzdEOzs7Ozs7Ozs7Ozs7Ozs7QUNOTyxNQUFNWSw0QkFBNEIsR0FBRyxZQUFZLENBQUMsTUFBTSx1VEFBcUcsRUFBRU4sWUFBWTtBQUMzSyxNQUFNTyw0QkFBNEIsR0FBRyxZQUFZLENBQUMsTUFBTSx1VEFBcUcsRUFBRWpCLFlBQVksQyIsInNvdXJjZXMiOlsid2VicGFjazovLy8uLi8uLi8uLi8uLi8uLi8uLi9Vc2Vycy9US0EvRG9jdW1lbnRzL01lbmRpeC9RdWl6QXBwL2phdmFzY3JpcHRzb3VyY2UvbmFub2Zsb3djb21tb25zL2FjdGlvbnMvSGlkZVByb2dyZXNzLmpzIiwid2VicGFjazovLy8uLi8uLi8uLi8uLi8uLi8uLi9Vc2Vycy9US0EvRG9jdW1lbnRzL01lbmRpeC9RdWl6QXBwL2phdmFzY3JpcHRzb3VyY2UvbmFub2Zsb3djb21tb25zL2FjdGlvbnMvU2hvd1Byb2dyZXNzLmpzIiwid2VicGFjazovLy9leHRlcm5hbCBhbWQgXCJiaWcuanNcIiIsIndlYnBhY2s6Ly8vd2VicGFjay9ib290c3RyYXAiLCJ3ZWJwYWNrOi8vL3dlYnBhY2svcnVudGltZS9jb21wYXQgZ2V0IGRlZmF1bHQgZXhwb3J0Iiwid2VicGFjazovLy93ZWJwYWNrL3J1bnRpbWUvZGVmaW5lIHByb3BlcnR5IGdldHRlcnMiLCJ3ZWJwYWNrOi8vL3dlYnBhY2svcnVudGltZS9oYXNPd25Qcm9wZXJ0eSBzaG9ydGhhbmQiLCJ3ZWJwYWNrOi8vL3dlYnBhY2svcnVudGltZS9tYWtlIG5hbWVzcGFjZSBvYmplY3QiLCJ3ZWJwYWNrOi8vLy4uLy4uLy4uLy4uLy4uLy4uL1VzZXJzL1RLQS9Eb2N1bWVudHMvTWVuZGl4L1F1aXpBcHAvZGVwbG95bWVudC90bXAvanNhY3Rpb25zLmpzIl0sInNvdXJjZXNDb250ZW50IjpbIi8vIFRoaXMgZmlsZSB3YXMgZ2VuZXJhdGVkIGJ5IE1lbmRpeCBTdHVkaW8gUHJvLlxyXG4vL1xyXG4vLyBXQVJOSU5HOiBPbmx5IHRoZSBmb2xsb3dpbmcgY29kZSB3aWxsIGJlIHJldGFpbmVkIHdoZW4gYWN0aW9ucyBhcmUgcmVnZW5lcmF0ZWQ6XHJcbi8vIC0gdGhlIGltcG9ydCBsaXN0XHJcbi8vIC0gdGhlIGNvZGUgYmV0d2VlbiBCRUdJTiBVU0VSIENPREUgYW5kIEVORCBVU0VSIENPREVcclxuLy8gLSB0aGUgY29kZSBiZXR3ZWVuIEJFR0lOIEVYVFJBIENPREUgYW5kIEVORCBFWFRSQSBDT0RFXHJcbi8vIE90aGVyIGNvZGUgeW91IHdyaXRlIHdpbGwgYmUgbG9zdCB0aGUgbmV4dCB0aW1lIHlvdSBkZXBsb3kgdGhlIHByb2plY3QuXHJcbmltcG9ydCB7IEJpZyB9IGZyb20gXCJiaWcuanNcIjtcclxuXHJcbi8vIEJFR0lOIEVYVFJBIENPREVcclxuLy8gRU5EIEVYVFJBIENPREVcclxuXHJcbi8qKlxyXG4gKiBIaWRlcyBkZWZhdWx0IHByb2dyZXNzIGJhclxyXG4gKiBAcGFyYW0ge0JpZ30gaWRlbnRpZmllciAtIElkZW50aWZpZXIgb2YgdWkgd2hpY2ggc2hvdWxkIGJlIGhpZGRlbi4gVGhpcyBwYXJhbSBpcyByZXF1aXJlZFxyXG4gKiBAcmV0dXJucyB7UHJvbWlzZS48dm9pZD59XHJcbiAqL1xyXG5leHBvcnQgYXN5bmMgZnVuY3Rpb24gSGlkZVByb2dyZXNzKGlkZW50aWZpZXIpIHtcclxuXHQvLyBCRUdJTiBVU0VSIENPREVcclxuICAgIGlmIChpZGVudGlmaWVyID09IG51bGwpIHtcclxuICAgICAgICByZXR1cm4gUHJvbWlzZS5yZWplY3QobmV3IEVycm9yKFwiSW5wdXQgcGFyYW1ldGVyICdJZGVudGlmaWVyJyBpcyByZXF1aXJlZFwiKSk7XHJcbiAgICB9XHJcbiAgICBteC51aS5oaWRlUHJvZ3Jlc3MoTnVtYmVyKGlkZW50aWZpZXIpKTtcclxuICAgIHJldHVybiBQcm9taXNlLnJlc29sdmUoKTtcclxuXHQvLyBFTkQgVVNFUiBDT0RFXHJcbn1cclxuIiwiLy8gVGhpcyBmaWxlIHdhcyBnZW5lcmF0ZWQgYnkgTWVuZGl4IFN0dWRpbyBQcm8uXHJcbi8vXHJcbi8vIFdBUk5JTkc6IE9ubHkgdGhlIGZvbGxvd2luZyBjb2RlIHdpbGwgYmUgcmV0YWluZWQgd2hlbiBhY3Rpb25zIGFyZSByZWdlbmVyYXRlZDpcclxuLy8gLSB0aGUgaW1wb3J0IGxpc3RcclxuLy8gLSB0aGUgY29kZSBiZXR3ZWVuIEJFR0lOIFVTRVIgQ09ERSBhbmQgRU5EIFVTRVIgQ09ERVxyXG4vLyAtIHRoZSBjb2RlIGJldHdlZW4gQkVHSU4gRVhUUkEgQ09ERSBhbmQgRU5EIEVYVFJBIENPREVcclxuLy8gT3RoZXIgY29kZSB5b3Ugd3JpdGUgd2lsbCBiZSBsb3N0IHRoZSBuZXh0IHRpbWUgeW91IGRlcGxveSB0aGUgcHJvamVjdC5cclxuaW1wb3J0IHsgQmlnIH0gZnJvbSBcImJpZy5qc1wiO1xyXG5cclxuLy8gQkVHSU4gRVhUUkEgQ09ERVxyXG4vLyBFTkQgRVhUUkEgQ09ERVxyXG5cclxuLyoqXHJcbiAqIFNob3dzIGRlZmF1bHQgcHJvZ3Jlc3MgYmFyXHJcbiAqIEBwYXJhbSB7c3RyaW5nfSBtZXNzYWdlIC0gVGhlIHRleHQgdG8gc2hvdyB3aGlsZSBsb2FkaW5nLlxyXG4gKiBAcGFyYW0ge2Jvb2xlYW59IGJsb2NraW5nIC0gQmxvY2sgdGhlIHVzZXIgaW50ZXJmYWNlIGltbWVkaWF0ZWx5LlxyXG4gKiBAcmV0dXJucyB7UHJvbWlzZS48QmlnPn1cclxuICovXHJcbmV4cG9ydCBhc3luYyBmdW5jdGlvbiBTaG93UHJvZ3Jlc3MobWVzc2FnZSwgYmxvY2tpbmcpIHtcclxuXHQvLyBCRUdJTiBVU0VSIENPREVcclxuICAgIGNvbnN0IGlkID0gbXgudWkuc2hvd1Byb2dyZXNzKG1lc3NhZ2UsIGJsb2NraW5nKTtcclxuICAgIGlmIChpZCAhPT0gdW5kZWZpbmVkKSB7XHJcbiAgICAgICAgcmV0dXJuIFByb21pc2UucmVzb2x2ZShuZXcgQmlnKGlkKSk7XHJcbiAgICB9XHJcbiAgICByZXR1cm4gUHJvbWlzZS5yZWplY3QobmV3IEVycm9yKFwiQ291bGQgbm90IG9wZW4gdGhlIGxvYWRpbmcgZGlhbG9nXCIpKTtcclxuXHQvLyBFTkQgVVNFUiBDT0RFXHJcbn1cclxuIiwibW9kdWxlLmV4cG9ydHMgPSBfX1dFQlBBQ0tfRVhURVJOQUxfTU9EVUxFX2JpZ19qc19fOyIsIi8vIFRoZSBtb2R1bGUgY2FjaGVcbnZhciBfX3dlYnBhY2tfbW9kdWxlX2NhY2hlX18gPSB7fTtcblxuLy8gVGhlIHJlcXVpcmUgZnVuY3Rpb25cbmZ1bmN0aW9uIF9fd2VicGFja19yZXF1aXJlX18obW9kdWxlSWQpIHtcblx0Ly8gQ2hlY2sgaWYgbW9kdWxlIGlzIGluIGNhY2hlXG5cdHZhciBjYWNoZWRNb2R1bGUgPSBfX3dlYnBhY2tfbW9kdWxlX2NhY2hlX19bbW9kdWxlSWRdO1xuXHRpZiAoY2FjaGVkTW9kdWxlICE9PSB1bmRlZmluZWQpIHtcblx0XHRyZXR1cm4gY2FjaGVkTW9kdWxlLmV4cG9ydHM7XG5cdH1cblx0Ly8gQ3JlYXRlIGEgbmV3IG1vZHVsZSAoYW5kIHB1dCBpdCBpbnRvIHRoZSBjYWNoZSlcblx0dmFyIG1vZHVsZSA9IF9fd2VicGFja19tb2R1bGVfY2FjaGVfX1ttb2R1bGVJZF0gPSB7XG5cdFx0Ly8gbm8gbW9kdWxlLmlkIG5lZWRlZFxuXHRcdC8vIG5vIG1vZHVsZS5sb2FkZWQgbmVlZGVkXG5cdFx0ZXhwb3J0czoge31cblx0fTtcblxuXHQvLyBFeGVjdXRlIHRoZSBtb2R1bGUgZnVuY3Rpb25cblx0X193ZWJwYWNrX21vZHVsZXNfX1ttb2R1bGVJZF0obW9kdWxlLCBtb2R1bGUuZXhwb3J0cywgX193ZWJwYWNrX3JlcXVpcmVfXyk7XG5cblx0Ly8gUmV0dXJuIHRoZSBleHBvcnRzIG9mIHRoZSBtb2R1bGVcblx0cmV0dXJuIG1vZHVsZS5leHBvcnRzO1xufVxuXG4iLCIvLyBnZXREZWZhdWx0RXhwb3J0IGZ1bmN0aW9uIGZvciBjb21wYXRpYmlsaXR5IHdpdGggbm9uLWhhcm1vbnkgbW9kdWxlc1xuX193ZWJwYWNrX3JlcXVpcmVfXy5uID0gKG1vZHVsZSkgPT4ge1xuXHR2YXIgZ2V0dGVyID0gbW9kdWxlICYmIG1vZHVsZS5fX2VzTW9kdWxlID9cblx0XHQoKSA9PiAobW9kdWxlWydkZWZhdWx0J10pIDpcblx0XHQoKSA9PiAobW9kdWxlKTtcblx0X193ZWJwYWNrX3JlcXVpcmVfXy5kKGdldHRlciwgeyBhOiBnZXR0ZXIgfSk7XG5cdHJldHVybiBnZXR0ZXI7XG59OyIsIi8vIGRlZmluZSBnZXR0ZXIgZnVuY3Rpb25zIGZvciBoYXJtb255IGV4cG9ydHNcbl9fd2VicGFja19yZXF1aXJlX18uZCA9IChleHBvcnRzLCBkZWZpbml0aW9uKSA9PiB7XG5cdGZvcih2YXIga2V5IGluIGRlZmluaXRpb24pIHtcblx0XHRpZihfX3dlYnBhY2tfcmVxdWlyZV9fLm8oZGVmaW5pdGlvbiwga2V5KSAmJiAhX193ZWJwYWNrX3JlcXVpcmVfXy5vKGV4cG9ydHMsIGtleSkpIHtcblx0XHRcdE9iamVjdC5kZWZpbmVQcm9wZXJ0eShleHBvcnRzLCBrZXksIHsgZW51bWVyYWJsZTogdHJ1ZSwgZ2V0OiBkZWZpbml0aW9uW2tleV0gfSk7XG5cdFx0fVxuXHR9XG59OyIsIl9fd2VicGFja19yZXF1aXJlX18ubyA9IChvYmosIHByb3ApID0+IChPYmplY3QucHJvdG90eXBlLmhhc093blByb3BlcnR5LmNhbGwob2JqLCBwcm9wKSkiLCIvLyBkZWZpbmUgX19lc01vZHVsZSBvbiBleHBvcnRzXG5fX3dlYnBhY2tfcmVxdWlyZV9fLnIgPSAoZXhwb3J0cykgPT4ge1xuXHRpZih0eXBlb2YgU3ltYm9sICE9PSAndW5kZWZpbmVkJyAmJiBTeW1ib2wudG9TdHJpbmdUYWcpIHtcblx0XHRPYmplY3QuZGVmaW5lUHJvcGVydHkoZXhwb3J0cywgU3ltYm9sLnRvU3RyaW5nVGFnLCB7IHZhbHVlOiAnTW9kdWxlJyB9KTtcblx0fVxuXHRPYmplY3QuZGVmaW5lUHJvcGVydHkoZXhwb3J0cywgJ19fZXNNb2R1bGUnLCB7IHZhbHVlOiB0cnVlIH0pO1xufTsiLCJleHBvcnQgY29uc3QgTmFub2Zsb3dDb21tb25zJFNob3dQcm9ncmVzcyA9IGFzeW5jICgpID0+IChhd2FpdCBpbXBvcnQoXCJDOi9Vc2Vycy9US0EvRG9jdW1lbnRzL01lbmRpeC9RdWl6QXBwL2phdmFzY3JpcHRzb3VyY2UvbmFub2Zsb3djb21tb25zL2FjdGlvbnMvU2hvd1Byb2dyZXNzXCIpKS5TaG93UHJvZ3Jlc3M7XG5leHBvcnQgY29uc3QgTmFub2Zsb3dDb21tb25zJEhpZGVQcm9ncmVzcyA9IGFzeW5jICgpID0+IChhd2FpdCBpbXBvcnQoXCJDOi9Vc2Vycy9US0EvRG9jdW1lbnRzL01lbmRpeC9RdWl6QXBwL2phdmFzY3JpcHRzb3VyY2UvbmFub2Zsb3djb21tb25zL2FjdGlvbnMvSGlkZVByb2dyZXNzXCIpKS5IaWRlUHJvZ3Jlc3M7XG4iXSwibmFtZXMiOlsiQmlnIiwiSGlkZVByb2dyZXNzIiwiaWRlbnRpZmllciIsIlByb21pc2UiLCJyZWplY3QiLCJFcnJvciIsIm14IiwidWkiLCJoaWRlUHJvZ3Jlc3MiLCJOdW1iZXIiLCJyZXNvbHZlIiwiU2hvd1Byb2dyZXNzIiwibWVzc2FnZSIsImJsb2NraW5nIiwiaWQiLCJzaG93UHJvZ3Jlc3MiLCJ1bmRlZmluZWQiLCJOYW5vZmxvd0NvbW1vbnMkU2hvd1Byb2dyZXNzIiwiTmFub2Zsb3dDb21tb25zJEhpZGVQcm9ncmVzcyJdLCJzb3VyY2VSb290IjoiIn0=