package com.fruitson.study.corejava.ch04.sec03;

public enum Operation {

	ADD {
		public int eval(int arg1, int arg2) {
			return arg1 + arg2;
		}
	},
	
	SUBSTRACT {
		public int eval(int arg1, int arg2) {
			return arg1 - arg2;
		}
	},
	
	MULTIPLY {
		public int eval(int arg1, int arg2) {
			return arg1 * arg2;
		}
	},
	
	DIVIDE {
		public int eval(int arg1, int arg2) {
			return arg1 / arg2;
		}
	};
	
	public abstract int eval(int arg1, int arg2);
}
