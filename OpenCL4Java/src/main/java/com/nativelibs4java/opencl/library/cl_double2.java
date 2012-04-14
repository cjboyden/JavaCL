package com.nativelibs4java.opencl.library;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Union;
/**
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Union 
@Library("OpenCL") 
public class cl_double2 extends StructObject {
	public cl_double2() {
		super();
	}
	/// C type : cl_double[2]
	@Array({2}) 
	@Field(0) 
	public Pointer<Double > s() {
		return this.io.getPointerField(this, 0);
	}
	/// C type : field1_struct
	@Field(1) 
	public com.nativelibs4java.opencl.library.cl_char2.field1_struct field1() {
		return this.io.getNativeObjectField(this, 1);
	}
	/// C type : field1_struct
	@Field(1) 
	public cl_double2 field1(com.nativelibs4java.opencl.library.cl_char2.field1_struct field1) {
		this.io.setNativeObjectField(this, 1, field1);
		return this;
	}
	/// C type : field2_struct
	@Field(2) 
	public com.nativelibs4java.opencl.library.cl_char2.field2_struct field2() {
		return this.io.getNativeObjectField(this, 2);
	}
	/// C type : field2_struct
	@Field(2) 
	public cl_double2 field2(com.nativelibs4java.opencl.library.cl_char2.field2_struct field2) {
		this.io.setNativeObjectField(this, 2, field2);
		return this;
	}
	/// C type : field3_struct
	@Field(3) 
	public com.nativelibs4java.opencl.library.cl_char2.field3_struct field3() {
		return this.io.getNativeObjectField(this, 3);
	}
	/// C type : field3_struct
	@Field(3) 
	public cl_double2 field3(com.nativelibs4java.opencl.library.cl_char2.field3_struct field3) {
		this.io.setNativeObjectField(this, 3, field3);
		return this;
	}
	public static class field1_struct extends StructObject {
		public field1_struct() {
			super();
		}
		/// C type : cl_double
		@Field(0) 
		public double x() {
			return this.io.getDoubleField(this, 0);
		}
		/// C type : cl_double
		@Field(0) 
		public field1_struct x(double x) {
			this.io.setDoubleField(this, 0, x);
			return this;
		}
		/// C type : cl_double
		@Field(1) 
		public double y() {
			return this.io.getDoubleField(this, 1);
		}
		/// C type : cl_double
		@Field(1) 
		public field1_struct y(double y) {
			this.io.setDoubleField(this, 1, y);
			return this;
		}
		public field1_struct(Pointer pointer) {
			super(pointer);
		}
	};
	public static class field2_struct extends StructObject {
		public field2_struct() {
			super();
		}
		/// C type : cl_double
		@Field(0) 
		public double s0() {
			return this.io.getDoubleField(this, 0);
		}
		/// C type : cl_double
		@Field(0) 
		public field2_struct s0(double s0) {
			this.io.setDoubleField(this, 0, s0);
			return this;
		}
		/// C type : cl_double
		@Field(1) 
		public double s1() {
			return this.io.getDoubleField(this, 1);
		}
		/// C type : cl_double
		@Field(1) 
		public field2_struct s1(double s1) {
			this.io.setDoubleField(this, 1, s1);
			return this;
		}
		public field2_struct(Pointer pointer) {
			super(pointer);
		}
	};
	public static class field3_struct extends StructObject {
		public field3_struct() {
			super();
		}
		/// C type : cl_double
		@Field(0) 
		public double lo() {
			return this.io.getDoubleField(this, 0);
		}
		/// C type : cl_double
		@Field(0) 
		public field3_struct lo(double lo) {
			this.io.setDoubleField(this, 0, lo);
			return this;
		}
		/// C type : cl_double
		@Field(1) 
		public double hi() {
			return this.io.getDoubleField(this, 1);
		}
		/// C type : cl_double
		@Field(1) 
		public field3_struct hi(double hi) {
			this.io.setDoubleField(this, 1, hi);
			return this;
		}
		public field3_struct(Pointer pointer) {
			super(pointer);
		}
	};
	public cl_double2(Pointer pointer) {
		super(pointer);
	}
}
