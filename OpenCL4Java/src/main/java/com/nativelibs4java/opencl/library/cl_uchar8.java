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
public class cl_uchar8 extends StructObject {
	public cl_uchar8() {
		super();
	}
	/// C type : cl_uchar[8]
	@Array({8}) 
	@Field(0) 
	public Pointer<Byte > s() {
		return this.io.getPointerField(this, 0);
	}
	/// C type : field1_struct
	@Field(1) 
	public com.nativelibs4java.opencl.library.cl_char2.field1_struct field1() {
		return this.io.getNativeObjectField(this, 1);
	}
	/// C type : field1_struct
	@Field(1) 
	public cl_uchar8 field1(com.nativelibs4java.opencl.library.cl_char2.field1_struct field1) {
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
	public cl_uchar8 field2(com.nativelibs4java.opencl.library.cl_char2.field2_struct field2) {
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
	public cl_uchar8 field3(com.nativelibs4java.opencl.library.cl_char2.field3_struct field3) {
		this.io.setNativeObjectField(this, 3, field3);
		return this;
	}
	public static class field1_struct extends StructObject {
		public field1_struct() {
			super();
		}
		/// C type : cl_uchar
		@Field(0) 
		public byte x() {
			return this.io.getByteField(this, 0);
		}
		/// C type : cl_uchar
		@Field(0) 
		public field1_struct x(byte x) {
			this.io.setByteField(this, 0, x);
			return this;
		}
		/// C type : cl_uchar
		@Field(1) 
		public byte y() {
			return this.io.getByteField(this, 1);
		}
		/// C type : cl_uchar
		@Field(1) 
		public field1_struct y(byte y) {
			this.io.setByteField(this, 1, y);
			return this;
		}
		/// C type : cl_uchar
		@Field(2) 
		public byte z() {
			return this.io.getByteField(this, 2);
		}
		/// C type : cl_uchar
		@Field(2) 
		public field1_struct z(byte z) {
			this.io.setByteField(this, 2, z);
			return this;
		}
		/// C type : cl_uchar
		@Field(3) 
		public byte w() {
			return this.io.getByteField(this, 3);
		}
		/// C type : cl_uchar
		@Field(3) 
		public field1_struct w(byte w) {
			this.io.setByteField(this, 3, w);
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
		/// C type : cl_uchar
		@Field(0) 
		public byte s0() {
			return this.io.getByteField(this, 0);
		}
		/// C type : cl_uchar
		@Field(0) 
		public field2_struct s0(byte s0) {
			this.io.setByteField(this, 0, s0);
			return this;
		}
		/// C type : cl_uchar
		@Field(1) 
		public byte s1() {
			return this.io.getByteField(this, 1);
		}
		/// C type : cl_uchar
		@Field(1) 
		public field2_struct s1(byte s1) {
			this.io.setByteField(this, 1, s1);
			return this;
		}
		/// C type : cl_uchar
		@Field(2) 
		public byte s2() {
			return this.io.getByteField(this, 2);
		}
		/// C type : cl_uchar
		@Field(2) 
		public field2_struct s2(byte s2) {
			this.io.setByteField(this, 2, s2);
			return this;
		}
		/// C type : cl_uchar
		@Field(3) 
		public byte s3() {
			return this.io.getByteField(this, 3);
		}
		/// C type : cl_uchar
		@Field(3) 
		public field2_struct s3(byte s3) {
			this.io.setByteField(this, 3, s3);
			return this;
		}
		/// C type : cl_uchar
		@Field(4) 
		public byte s4() {
			return this.io.getByteField(this, 4);
		}
		/// C type : cl_uchar
		@Field(4) 
		public field2_struct s4(byte s4) {
			this.io.setByteField(this, 4, s4);
			return this;
		}
		/// C type : cl_uchar
		@Field(5) 
		public byte s5() {
			return this.io.getByteField(this, 5);
		}
		/// C type : cl_uchar
		@Field(5) 
		public field2_struct s5(byte s5) {
			this.io.setByteField(this, 5, s5);
			return this;
		}
		/// C type : cl_uchar
		@Field(6) 
		public byte s6() {
			return this.io.getByteField(this, 6);
		}
		/// C type : cl_uchar
		@Field(6) 
		public field2_struct s6(byte s6) {
			this.io.setByteField(this, 6, s6);
			return this;
		}
		/// C type : cl_uchar
		@Field(7) 
		public byte s7() {
			return this.io.getByteField(this, 7);
		}
		/// C type : cl_uchar
		@Field(7) 
		public field2_struct s7(byte s7) {
			this.io.setByteField(this, 7, s7);
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
		/// C type : cl_uchar4
		@Field(0) 
		public cl_uchar4 lo() {
			return this.io.getNativeObjectField(this, 0);
		}
		/// C type : cl_uchar4
		@Field(0) 
		public field3_struct lo(cl_uchar4 lo) {
			this.io.setNativeObjectField(this, 0, lo);
			return this;
		}
		/// C type : cl_uchar4
		@Field(1) 
		public cl_uchar4 hi() {
			return this.io.getNativeObjectField(this, 1);
		}
		/// C type : cl_uchar4
		@Field(1) 
		public field3_struct hi(cl_uchar4 hi) {
			this.io.setNativeObjectField(this, 1, hi);
			return this;
		}
		public field3_struct(Pointer pointer) {
			super(pointer);
		}
	};
	public cl_uchar8(Pointer pointer) {
		super(pointer);
	}
}
