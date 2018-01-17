@file:Suppress("unused")

package blue.sparse.math.vectors.doubles

val Double.xx: Vector2d get() = Vector2d(this, this)
val Double.xxx: Vector3d get() = Vector3d(this, this, this)
val Double.xxxx: Vector4d get() = Vector4d(this, this, this, this)

/*
-----------------------------------------
	Generated swizzling code for Vector2d
-----------------------------------------
 */

val Vector2d.xx  : Vector2d get() = Vector2d(x, x)
val Vector2d.xy  : Vector2d get() = Vector2d(x, y)
val Vector2d.yx  : Vector2d get() = Vector2d(y, x)
val Vector2d.yy  : Vector2d get() = Vector2d(y, y)
val Vector2d.xxx : Vector3d get() = Vector3d(x, x, x)
val Vector2d.xxy : Vector3d get() = Vector3d(x, x, y)
val Vector2d.xyx : Vector3d get() = Vector3d(x, y, x)
val Vector2d.xyy : Vector3d get() = Vector3d(x, y, y)
val Vector2d.yxx : Vector3d get() = Vector3d(y, x, x)
val Vector2d.yxy : Vector3d get() = Vector3d(y, x, y)
val Vector2d.yyx : Vector3d get() = Vector3d(y, y, x)
val Vector2d.yyy : Vector3d get() = Vector3d(y, y, y)
val Vector2d.xxxx: Vector4d get() = Vector4d(x, x, x, x)
val Vector2d.xxxy: Vector4d get() = Vector4d(x, x, x, y)
val Vector2d.xxyx: Vector4d get() = Vector4d(x, x, y, x)
val Vector2d.xxyy: Vector4d get() = Vector4d(x, x, y, y)
val Vector2d.xyxx: Vector4d get() = Vector4d(x, y, x, x)
val Vector2d.xyxy: Vector4d get() = Vector4d(x, y, x, y)
val Vector2d.xyyx: Vector4d get() = Vector4d(x, y, y, x)
val Vector2d.xyyy: Vector4d get() = Vector4d(x, y, y, y)
val Vector2d.yxxx: Vector4d get() = Vector4d(y, x, x, x)
val Vector2d.yxxy: Vector4d get() = Vector4d(y, x, x, y)
val Vector2d.yxyx: Vector4d get() = Vector4d(y, x, y, x)
val Vector2d.yxyy: Vector4d get() = Vector4d(y, x, y, y)
val Vector2d.yyxx: Vector4d get() = Vector4d(y, y, x, x)
val Vector2d.yyxy: Vector4d get() = Vector4d(y, y, x, y)
val Vector2d.yyyx: Vector4d get() = Vector4d(y, y, y, x)
val Vector2d.yyyy: Vector4d get() = Vector4d(y, y, y, y)


/*
-----------------------------------------
	Generated swizzling code for Vector3d
-----------------------------------------
 */

val Vector3d.xx: Vector2d get() = Vector2d(x, x)
val Vector3d.xy: Vector2d get() = Vector2d(x, y)
val Vector3d.xz: Vector2d get() = Vector2d(x, z)
val Vector3d.yx: Vector2d get() = Vector2d(y, x)
val Vector3d.yy: Vector2d get() = Vector2d(y, y)
val Vector3d.yz: Vector2d get() = Vector2d(y, z)
val Vector3d.zx: Vector2d get() = Vector2d(z, x)
val Vector3d.zy: Vector2d get() = Vector2d(z, y)
val Vector3d.zz: Vector2d get() = Vector2d(z, z)
val Vector3d.xxx: Vector3d get() = Vector3d(x, x, x)
val Vector3d.xxy: Vector3d get() = Vector3d(x, x, y)
val Vector3d.xxz: Vector3d get() = Vector3d(x, x, z)
val Vector3d.xyx: Vector3d get() = Vector3d(x, y, x)
val Vector3d.xyy: Vector3d get() = Vector3d(x, y, y)
val Vector3d.xyz: Vector3d get() = Vector3d(x, y, z)
val Vector3d.xzx: Vector3d get() = Vector3d(x, z, x)
val Vector3d.xzy: Vector3d get() = Vector3d(x, z, y)
val Vector3d.xzz: Vector3d get() = Vector3d(x, z, z)
val Vector3d.yxx: Vector3d get() = Vector3d(y, x, x)
val Vector3d.yxy: Vector3d get() = Vector3d(y, x, y)
val Vector3d.yxz: Vector3d get() = Vector3d(y, x, z)
val Vector3d.yyx: Vector3d get() = Vector3d(y, y, x)
val Vector3d.yyy: Vector3d get() = Vector3d(y, y, y)
val Vector3d.yyz: Vector3d get() = Vector3d(y, y, z)
val Vector3d.yzx: Vector3d get() = Vector3d(y, z, x)
val Vector3d.yzy: Vector3d get() = Vector3d(y, z, y)
val Vector3d.yzz: Vector3d get() = Vector3d(y, z, z)
val Vector3d.zxx: Vector3d get() = Vector3d(z, x, x)
val Vector3d.zxy: Vector3d get() = Vector3d(z, x, y)
val Vector3d.zxz: Vector3d get() = Vector3d(z, x, z)
val Vector3d.zyx: Vector3d get() = Vector3d(z, y, x)
val Vector3d.zyy: Vector3d get() = Vector3d(z, y, y)
val Vector3d.zyz: Vector3d get() = Vector3d(z, y, z)
val Vector3d.zzx: Vector3d get() = Vector3d(z, z, x)
val Vector3d.zzy: Vector3d get() = Vector3d(z, z, y)
val Vector3d.zzz: Vector3d get() = Vector3d(z, z, z)
val Vector3d.xxxx: Vector4d get() = Vector4d(x, x, x, x)
val Vector3d.xxxy: Vector4d get() = Vector4d(x, x, x, y)
val Vector3d.xxxz: Vector4d get() = Vector4d(x, x, x, z)
val Vector3d.xxyx: Vector4d get() = Vector4d(x, x, y, x)
val Vector3d.xxyy: Vector4d get() = Vector4d(x, x, y, y)
val Vector3d.xxyz: Vector4d get() = Vector4d(x, x, y, z)
val Vector3d.xxzx: Vector4d get() = Vector4d(x, x, z, x)
val Vector3d.xxzy: Vector4d get() = Vector4d(x, x, z, y)
val Vector3d.xxzz: Vector4d get() = Vector4d(x, x, z, z)
val Vector3d.xyxx: Vector4d get() = Vector4d(x, y, x, x)
val Vector3d.xyxy: Vector4d get() = Vector4d(x, y, x, y)
val Vector3d.xyxz: Vector4d get() = Vector4d(x, y, x, z)
val Vector3d.xyyx: Vector4d get() = Vector4d(x, y, y, x)
val Vector3d.xyyy: Vector4d get() = Vector4d(x, y, y, y)
val Vector3d.xyyz: Vector4d get() = Vector4d(x, y, y, z)
val Vector3d.xyzx: Vector4d get() = Vector4d(x, y, z, x)
val Vector3d.xyzy: Vector4d get() = Vector4d(x, y, z, y)
val Vector3d.xyzz: Vector4d get() = Vector4d(x, y, z, z)
val Vector3d.xzxx: Vector4d get() = Vector4d(x, z, x, x)
val Vector3d.xzxy: Vector4d get() = Vector4d(x, z, x, y)
val Vector3d.xzxz: Vector4d get() = Vector4d(x, z, x, z)
val Vector3d.xzyx: Vector4d get() = Vector4d(x, z, y, x)
val Vector3d.xzyy: Vector4d get() = Vector4d(x, z, y, y)
val Vector3d.xzyz: Vector4d get() = Vector4d(x, z, y, z)
val Vector3d.xzzx: Vector4d get() = Vector4d(x, z, z, x)
val Vector3d.xzzy: Vector4d get() = Vector4d(x, z, z, y)
val Vector3d.xzzz: Vector4d get() = Vector4d(x, z, z, z)
val Vector3d.yxxx: Vector4d get() = Vector4d(y, x, x, x)
val Vector3d.yxxy: Vector4d get() = Vector4d(y, x, x, y)
val Vector3d.yxxz: Vector4d get() = Vector4d(y, x, x, z)
val Vector3d.yxyx: Vector4d get() = Vector4d(y, x, y, x)
val Vector3d.yxyy: Vector4d get() = Vector4d(y, x, y, y)
val Vector3d.yxyz: Vector4d get() = Vector4d(y, x, y, z)
val Vector3d.yxzx: Vector4d get() = Vector4d(y, x, z, x)
val Vector3d.yxzy: Vector4d get() = Vector4d(y, x, z, y)
val Vector3d.yxzz: Vector4d get() = Vector4d(y, x, z, z)
val Vector3d.yyxx: Vector4d get() = Vector4d(y, y, x, x)
val Vector3d.yyxy: Vector4d get() = Vector4d(y, y, x, y)
val Vector3d.yyxz: Vector4d get() = Vector4d(y, y, x, z)
val Vector3d.yyyx: Vector4d get() = Vector4d(y, y, y, x)
val Vector3d.yyyy: Vector4d get() = Vector4d(y, y, y, y)
val Vector3d.yyyz: Vector4d get() = Vector4d(y, y, y, z)
val Vector3d.yyzx: Vector4d get() = Vector4d(y, y, z, x)
val Vector3d.yyzy: Vector4d get() = Vector4d(y, y, z, y)
val Vector3d.yyzz: Vector4d get() = Vector4d(y, y, z, z)
val Vector3d.yzxx: Vector4d get() = Vector4d(y, z, x, x)
val Vector3d.yzxy: Vector4d get() = Vector4d(y, z, x, y)
val Vector3d.yzxz: Vector4d get() = Vector4d(y, z, x, z)
val Vector3d.yzyx: Vector4d get() = Vector4d(y, z, y, x)
val Vector3d.yzyy: Vector4d get() = Vector4d(y, z, y, y)
val Vector3d.yzyz: Vector4d get() = Vector4d(y, z, y, z)
val Vector3d.yzzx: Vector4d get() = Vector4d(y, z, z, x)
val Vector3d.yzzy: Vector4d get() = Vector4d(y, z, z, y)
val Vector3d.yzzz: Vector4d get() = Vector4d(y, z, z, z)
val Vector3d.zxxx: Vector4d get() = Vector4d(z, x, x, x)
val Vector3d.zxxy: Vector4d get() = Vector4d(z, x, x, y)
val Vector3d.zxxz: Vector4d get() = Vector4d(z, x, x, z)
val Vector3d.zxyx: Vector4d get() = Vector4d(z, x, y, x)
val Vector3d.zxyy: Vector4d get() = Vector4d(z, x, y, y)
val Vector3d.zxyz: Vector4d get() = Vector4d(z, x, y, z)
val Vector3d.zxzx: Vector4d get() = Vector4d(z, x, z, x)
val Vector3d.zxzy: Vector4d get() = Vector4d(z, x, z, y)
val Vector3d.zxzz: Vector4d get() = Vector4d(z, x, z, z)
val Vector3d.zyxx: Vector4d get() = Vector4d(z, y, x, x)
val Vector3d.zyxy: Vector4d get() = Vector4d(z, y, x, y)
val Vector3d.zyxz: Vector4d get() = Vector4d(z, y, x, z)
val Vector3d.zyyx: Vector4d get() = Vector4d(z, y, y, x)
val Vector3d.zyyy: Vector4d get() = Vector4d(z, y, y, y)
val Vector3d.zyyz: Vector4d get() = Vector4d(z, y, y, z)
val Vector3d.zyzx: Vector4d get() = Vector4d(z, y, z, x)
val Vector3d.zyzy: Vector4d get() = Vector4d(z, y, z, y)
val Vector3d.zyzz: Vector4d get() = Vector4d(z, y, z, z)
val Vector3d.zzxx: Vector4d get() = Vector4d(z, z, x, x)
val Vector3d.zzxy: Vector4d get() = Vector4d(z, z, x, y)
val Vector3d.zzxz: Vector4d get() = Vector4d(z, z, x, z)
val Vector3d.zzyx: Vector4d get() = Vector4d(z, z, y, x)
val Vector3d.zzyy: Vector4d get() = Vector4d(z, z, y, y)
val Vector3d.zzyz: Vector4d get() = Vector4d(z, z, y, z)
val Vector3d.zzzx: Vector4d get() = Vector4d(z, z, z, x)
val Vector3d.zzzy: Vector4d get() = Vector4d(z, z, z, y)
val Vector3d.zzzz: Vector4d get() = Vector4d(z, z, z, z)


/*
-----------------------------------------
	Generated swizzling code for Vector4d
-----------------------------------------
 */

val Vector4d.xx: Vector2d get() = Vector2d(x, x)
val Vector4d.xy: Vector2d get() = Vector2d(x, y)
val Vector4d.xz: Vector2d get() = Vector2d(x, z)
val Vector4d.xw: Vector2d get() = Vector2d(x, w)
val Vector4d.yx: Vector2d get() = Vector2d(y, x)
val Vector4d.yy: Vector2d get() = Vector2d(y, y)
val Vector4d.yz: Vector2d get() = Vector2d(y, z)
val Vector4d.yw: Vector2d get() = Vector2d(y, w)
val Vector4d.zx: Vector2d get() = Vector2d(z, x)
val Vector4d.zy: Vector2d get() = Vector2d(z, y)
val Vector4d.zz: Vector2d get() = Vector2d(z, z)
val Vector4d.zw: Vector2d get() = Vector2d(z, w)
val Vector4d.wx: Vector2d get() = Vector2d(w, x)
val Vector4d.wy: Vector2d get() = Vector2d(w, y)
val Vector4d.wz: Vector2d get() = Vector2d(w, z)
val Vector4d.ww: Vector2d get() = Vector2d(w, w)
val Vector4d.xxx: Vector3d get() = Vector3d(x, x, x)
val Vector4d.xxy: Vector3d get() = Vector3d(x, x, y)
val Vector4d.xxz: Vector3d get() = Vector3d(x, x, z)
val Vector4d.xxw: Vector3d get() = Vector3d(x, x, w)
val Vector4d.xyx: Vector3d get() = Vector3d(x, y, x)
val Vector4d.xyy: Vector3d get() = Vector3d(x, y, y)
val Vector4d.xyz: Vector3d get() = Vector3d(x, y, z)
val Vector4d.xyw: Vector3d get() = Vector3d(x, y, w)
val Vector4d.xzx: Vector3d get() = Vector3d(x, z, x)
val Vector4d.xzy: Vector3d get() = Vector3d(x, z, y)
val Vector4d.xzz: Vector3d get() = Vector3d(x, z, z)
val Vector4d.xzw: Vector3d get() = Vector3d(x, z, w)
val Vector4d.xwx: Vector3d get() = Vector3d(x, w, x)
val Vector4d.xwy: Vector3d get() = Vector3d(x, w, y)
val Vector4d.xwz: Vector3d get() = Vector3d(x, w, z)
val Vector4d.xww: Vector3d get() = Vector3d(x, w, w)
val Vector4d.yxx: Vector3d get() = Vector3d(y, x, x)
val Vector4d.yxy: Vector3d get() = Vector3d(y, x, y)
val Vector4d.yxz: Vector3d get() = Vector3d(y, x, z)
val Vector4d.yxw: Vector3d get() = Vector3d(y, x, w)
val Vector4d.yyx: Vector3d get() = Vector3d(y, y, x)
val Vector4d.yyy: Vector3d get() = Vector3d(y, y, y)
val Vector4d.yyz: Vector3d get() = Vector3d(y, y, z)
val Vector4d.yyw: Vector3d get() = Vector3d(y, y, w)
val Vector4d.yzx: Vector3d get() = Vector3d(y, z, x)
val Vector4d.yzy: Vector3d get() = Vector3d(y, z, y)
val Vector4d.yzz: Vector3d get() = Vector3d(y, z, z)
val Vector4d.yzw: Vector3d get() = Vector3d(y, z, w)
val Vector4d.ywx: Vector3d get() = Vector3d(y, w, x)
val Vector4d.ywy: Vector3d get() = Vector3d(y, w, y)
val Vector4d.ywz: Vector3d get() = Vector3d(y, w, z)
val Vector4d.yww: Vector3d get() = Vector3d(y, w, w)
val Vector4d.zxx: Vector3d get() = Vector3d(z, x, x)
val Vector4d.zxy: Vector3d get() = Vector3d(z, x, y)
val Vector4d.zxz: Vector3d get() = Vector3d(z, x, z)
val Vector4d.zxw: Vector3d get() = Vector3d(z, x, w)
val Vector4d.zyx: Vector3d get() = Vector3d(z, y, x)
val Vector4d.zyy: Vector3d get() = Vector3d(z, y, y)
val Vector4d.zyz: Vector3d get() = Vector3d(z, y, z)
val Vector4d.zyw: Vector3d get() = Vector3d(z, y, w)
val Vector4d.zzx: Vector3d get() = Vector3d(z, z, x)
val Vector4d.zzy: Vector3d get() = Vector3d(z, z, y)
val Vector4d.zzz: Vector3d get() = Vector3d(z, z, z)
val Vector4d.zzw: Vector3d get() = Vector3d(z, z, w)
val Vector4d.zwx: Vector3d get() = Vector3d(z, w, x)
val Vector4d.zwy: Vector3d get() = Vector3d(z, w, y)
val Vector4d.zwz: Vector3d get() = Vector3d(z, w, z)
val Vector4d.zww: Vector3d get() = Vector3d(z, w, w)
val Vector4d.wxx: Vector3d get() = Vector3d(w, x, x)
val Vector4d.wxy: Vector3d get() = Vector3d(w, x, y)
val Vector4d.wxz: Vector3d get() = Vector3d(w, x, z)
val Vector4d.wxw: Vector3d get() = Vector3d(w, x, w)
val Vector4d.wyx: Vector3d get() = Vector3d(w, y, x)
val Vector4d.wyy: Vector3d get() = Vector3d(w, y, y)
val Vector4d.wyz: Vector3d get() = Vector3d(w, y, z)
val Vector4d.wyw: Vector3d get() = Vector3d(w, y, w)
val Vector4d.wzx: Vector3d get() = Vector3d(w, z, x)
val Vector4d.wzy: Vector3d get() = Vector3d(w, z, y)
val Vector4d.wzz: Vector3d get() = Vector3d(w, z, z)
val Vector4d.wzw: Vector3d get() = Vector3d(w, z, w)
val Vector4d.wwx: Vector3d get() = Vector3d(w, w, x)
val Vector4d.wwy: Vector3d get() = Vector3d(w, w, y)
val Vector4d.wwz: Vector3d get() = Vector3d(w, w, z)
val Vector4d.www: Vector3d get() = Vector3d(w, w, w)
val Vector4d.xxxx: Vector4d get() = Vector4d(x, x, x, x)
val Vector4d.xxxy: Vector4d get() = Vector4d(x, x, x, y)
val Vector4d.xxxz: Vector4d get() = Vector4d(x, x, x, z)
val Vector4d.xxxw: Vector4d get() = Vector4d(x, x, x, w)
val Vector4d.xxyx: Vector4d get() = Vector4d(x, x, y, x)
val Vector4d.xxyy: Vector4d get() = Vector4d(x, x, y, y)
val Vector4d.xxyz: Vector4d get() = Vector4d(x, x, y, z)
val Vector4d.xxyw: Vector4d get() = Vector4d(x, x, y, w)
val Vector4d.xxzx: Vector4d get() = Vector4d(x, x, z, x)
val Vector4d.xxzy: Vector4d get() = Vector4d(x, x, z, y)
val Vector4d.xxzz: Vector4d get() = Vector4d(x, x, z, z)
val Vector4d.xxzw: Vector4d get() = Vector4d(x, x, z, w)
val Vector4d.xxwx: Vector4d get() = Vector4d(x, x, w, x)
val Vector4d.xxwy: Vector4d get() = Vector4d(x, x, w, y)
val Vector4d.xxwz: Vector4d get() = Vector4d(x, x, w, z)
val Vector4d.xxww: Vector4d get() = Vector4d(x, x, w, w)
val Vector4d.xyxx: Vector4d get() = Vector4d(x, y, x, x)
val Vector4d.xyxy: Vector4d get() = Vector4d(x, y, x, y)
val Vector4d.xyxz: Vector4d get() = Vector4d(x, y, x, z)
val Vector4d.xyxw: Vector4d get() = Vector4d(x, y, x, w)
val Vector4d.xyyx: Vector4d get() = Vector4d(x, y, y, x)
val Vector4d.xyyy: Vector4d get() = Vector4d(x, y, y, y)
val Vector4d.xyyz: Vector4d get() = Vector4d(x, y, y, z)
val Vector4d.xyyw: Vector4d get() = Vector4d(x, y, y, w)
val Vector4d.xyzx: Vector4d get() = Vector4d(x, y, z, x)
val Vector4d.xyzy: Vector4d get() = Vector4d(x, y, z, y)
val Vector4d.xyzz: Vector4d get() = Vector4d(x, y, z, z)
val Vector4d.xyzw: Vector4d get() = Vector4d(x, y, z, w)
val Vector4d.xywx: Vector4d get() = Vector4d(x, y, w, x)
val Vector4d.xywy: Vector4d get() = Vector4d(x, y, w, y)
val Vector4d.xywz: Vector4d get() = Vector4d(x, y, w, z)
val Vector4d.xyww: Vector4d get() = Vector4d(x, y, w, w)
val Vector4d.xzxx: Vector4d get() = Vector4d(x, z, x, x)
val Vector4d.xzxy: Vector4d get() = Vector4d(x, z, x, y)
val Vector4d.xzxz: Vector4d get() = Vector4d(x, z, x, z)
val Vector4d.xzxw: Vector4d get() = Vector4d(x, z, x, w)
val Vector4d.xzyx: Vector4d get() = Vector4d(x, z, y, x)
val Vector4d.xzyy: Vector4d get() = Vector4d(x, z, y, y)
val Vector4d.xzyz: Vector4d get() = Vector4d(x, z, y, z)
val Vector4d.xzyw: Vector4d get() = Vector4d(x, z, y, w)
val Vector4d.xzzx: Vector4d get() = Vector4d(x, z, z, x)
val Vector4d.xzzy: Vector4d get() = Vector4d(x, z, z, y)
val Vector4d.xzzz: Vector4d get() = Vector4d(x, z, z, z)
val Vector4d.xzzw: Vector4d get() = Vector4d(x, z, z, w)
val Vector4d.xzwx: Vector4d get() = Vector4d(x, z, w, x)
val Vector4d.xzwy: Vector4d get() = Vector4d(x, z, w, y)
val Vector4d.xzwz: Vector4d get() = Vector4d(x, z, w, z)
val Vector4d.xzww: Vector4d get() = Vector4d(x, z, w, w)
val Vector4d.xwxx: Vector4d get() = Vector4d(x, w, x, x)
val Vector4d.xwxy: Vector4d get() = Vector4d(x, w, x, y)
val Vector4d.xwxz: Vector4d get() = Vector4d(x, w, x, z)
val Vector4d.xwxw: Vector4d get() = Vector4d(x, w, x, w)
val Vector4d.xwyx: Vector4d get() = Vector4d(x, w, y, x)
val Vector4d.xwyy: Vector4d get() = Vector4d(x, w, y, y)
val Vector4d.xwyz: Vector4d get() = Vector4d(x, w, y, z)
val Vector4d.xwyw: Vector4d get() = Vector4d(x, w, y, w)
val Vector4d.xwzx: Vector4d get() = Vector4d(x, w, z, x)
val Vector4d.xwzy: Vector4d get() = Vector4d(x, w, z, y)
val Vector4d.xwzz: Vector4d get() = Vector4d(x, w, z, z)
val Vector4d.xwzw: Vector4d get() = Vector4d(x, w, z, w)
val Vector4d.xwwx: Vector4d get() = Vector4d(x, w, w, x)
val Vector4d.xwwy: Vector4d get() = Vector4d(x, w, w, y)
val Vector4d.xwwz: Vector4d get() = Vector4d(x, w, w, z)
val Vector4d.xwww: Vector4d get() = Vector4d(x, w, w, w)
val Vector4d.yxxx: Vector4d get() = Vector4d(y, x, x, x)
val Vector4d.yxxy: Vector4d get() = Vector4d(y, x, x, y)
val Vector4d.yxxz: Vector4d get() = Vector4d(y, x, x, z)
val Vector4d.yxxw: Vector4d get() = Vector4d(y, x, x, w)
val Vector4d.yxyx: Vector4d get() = Vector4d(y, x, y, x)
val Vector4d.yxyy: Vector4d get() = Vector4d(y, x, y, y)
val Vector4d.yxyz: Vector4d get() = Vector4d(y, x, y, z)
val Vector4d.yxyw: Vector4d get() = Vector4d(y, x, y, w)
val Vector4d.yxzx: Vector4d get() = Vector4d(y, x, z, x)
val Vector4d.yxzy: Vector4d get() = Vector4d(y, x, z, y)
val Vector4d.yxzz: Vector4d get() = Vector4d(y, x, z, z)
val Vector4d.yxzw: Vector4d get() = Vector4d(y, x, z, w)
val Vector4d.yxwx: Vector4d get() = Vector4d(y, x, w, x)
val Vector4d.yxwy: Vector4d get() = Vector4d(y, x, w, y)
val Vector4d.yxwz: Vector4d get() = Vector4d(y, x, w, z)
val Vector4d.yxww: Vector4d get() = Vector4d(y, x, w, w)
val Vector4d.yyxx: Vector4d get() = Vector4d(y, y, x, x)
val Vector4d.yyxy: Vector4d get() = Vector4d(y, y, x, y)
val Vector4d.yyxz: Vector4d get() = Vector4d(y, y, x, z)
val Vector4d.yyxw: Vector4d get() = Vector4d(y, y, x, w)
val Vector4d.yyyx: Vector4d get() = Vector4d(y, y, y, x)
val Vector4d.yyyy: Vector4d get() = Vector4d(y, y, y, y)
val Vector4d.yyyz: Vector4d get() = Vector4d(y, y, y, z)
val Vector4d.yyyw: Vector4d get() = Vector4d(y, y, y, w)
val Vector4d.yyzx: Vector4d get() = Vector4d(y, y, z, x)
val Vector4d.yyzy: Vector4d get() = Vector4d(y, y, z, y)
val Vector4d.yyzz: Vector4d get() = Vector4d(y, y, z, z)
val Vector4d.yyzw: Vector4d get() = Vector4d(y, y, z, w)
val Vector4d.yywx: Vector4d get() = Vector4d(y, y, w, x)
val Vector4d.yywy: Vector4d get() = Vector4d(y, y, w, y)
val Vector4d.yywz: Vector4d get() = Vector4d(y, y, w, z)
val Vector4d.yyww: Vector4d get() = Vector4d(y, y, w, w)
val Vector4d.yzxx: Vector4d get() = Vector4d(y, z, x, x)
val Vector4d.yzxy: Vector4d get() = Vector4d(y, z, x, y)
val Vector4d.yzxz: Vector4d get() = Vector4d(y, z, x, z)
val Vector4d.yzxw: Vector4d get() = Vector4d(y, z, x, w)
val Vector4d.yzyx: Vector4d get() = Vector4d(y, z, y, x)
val Vector4d.yzyy: Vector4d get() = Vector4d(y, z, y, y)
val Vector4d.yzyz: Vector4d get() = Vector4d(y, z, y, z)
val Vector4d.yzyw: Vector4d get() = Vector4d(y, z, y, w)
val Vector4d.yzzx: Vector4d get() = Vector4d(y, z, z, x)
val Vector4d.yzzy: Vector4d get() = Vector4d(y, z, z, y)
val Vector4d.yzzz: Vector4d get() = Vector4d(y, z, z, z)
val Vector4d.yzzw: Vector4d get() = Vector4d(y, z, z, w)
val Vector4d.yzwx: Vector4d get() = Vector4d(y, z, w, x)
val Vector4d.yzwy: Vector4d get() = Vector4d(y, z, w, y)
val Vector4d.yzwz: Vector4d get() = Vector4d(y, z, w, z)
val Vector4d.yzww: Vector4d get() = Vector4d(y, z, w, w)
val Vector4d.ywxx: Vector4d get() = Vector4d(y, w, x, x)
val Vector4d.ywxy: Vector4d get() = Vector4d(y, w, x, y)
val Vector4d.ywxz: Vector4d get() = Vector4d(y, w, x, z)
val Vector4d.ywxw: Vector4d get() = Vector4d(y, w, x, w)
val Vector4d.ywyx: Vector4d get() = Vector4d(y, w, y, x)
val Vector4d.ywyy: Vector4d get() = Vector4d(y, w, y, y)
val Vector4d.ywyz: Vector4d get() = Vector4d(y, w, y, z)
val Vector4d.ywyw: Vector4d get() = Vector4d(y, w, y, w)
val Vector4d.ywzx: Vector4d get() = Vector4d(y, w, z, x)
val Vector4d.ywzy: Vector4d get() = Vector4d(y, w, z, y)
val Vector4d.ywzz: Vector4d get() = Vector4d(y, w, z, z)
val Vector4d.ywzw: Vector4d get() = Vector4d(y, w, z, w)
val Vector4d.ywwx: Vector4d get() = Vector4d(y, w, w, x)
val Vector4d.ywwy: Vector4d get() = Vector4d(y, w, w, y)
val Vector4d.ywwz: Vector4d get() = Vector4d(y, w, w, z)
val Vector4d.ywww: Vector4d get() = Vector4d(y, w, w, w)
val Vector4d.zxxx: Vector4d get() = Vector4d(z, x, x, x)
val Vector4d.zxxy: Vector4d get() = Vector4d(z, x, x, y)
val Vector4d.zxxz: Vector4d get() = Vector4d(z, x, x, z)
val Vector4d.zxxw: Vector4d get() = Vector4d(z, x, x, w)
val Vector4d.zxyx: Vector4d get() = Vector4d(z, x, y, x)
val Vector4d.zxyy: Vector4d get() = Vector4d(z, x, y, y)
val Vector4d.zxyz: Vector4d get() = Vector4d(z, x, y, z)
val Vector4d.zxyw: Vector4d get() = Vector4d(z, x, y, w)
val Vector4d.zxzx: Vector4d get() = Vector4d(z, x, z, x)
val Vector4d.zxzy: Vector4d get() = Vector4d(z, x, z, y)
val Vector4d.zxzz: Vector4d get() = Vector4d(z, x, z, z)
val Vector4d.zxzw: Vector4d get() = Vector4d(z, x, z, w)
val Vector4d.zxwx: Vector4d get() = Vector4d(z, x, w, x)
val Vector4d.zxwy: Vector4d get() = Vector4d(z, x, w, y)
val Vector4d.zxwz: Vector4d get() = Vector4d(z, x, w, z)
val Vector4d.zxww: Vector4d get() = Vector4d(z, x, w, w)
val Vector4d.zyxx: Vector4d get() = Vector4d(z, y, x, x)
val Vector4d.zyxy: Vector4d get() = Vector4d(z, y, x, y)
val Vector4d.zyxz: Vector4d get() = Vector4d(z, y, x, z)
val Vector4d.zyxw: Vector4d get() = Vector4d(z, y, x, w)
val Vector4d.zyyx: Vector4d get() = Vector4d(z, y, y, x)
val Vector4d.zyyy: Vector4d get() = Vector4d(z, y, y, y)
val Vector4d.zyyz: Vector4d get() = Vector4d(z, y, y, z)
val Vector4d.zyyw: Vector4d get() = Vector4d(z, y, y, w)
val Vector4d.zyzx: Vector4d get() = Vector4d(z, y, z, x)
val Vector4d.zyzy: Vector4d get() = Vector4d(z, y, z, y)
val Vector4d.zyzz: Vector4d get() = Vector4d(z, y, z, z)
val Vector4d.zyzw: Vector4d get() = Vector4d(z, y, z, w)
val Vector4d.zywx: Vector4d get() = Vector4d(z, y, w, x)
val Vector4d.zywy: Vector4d get() = Vector4d(z, y, w, y)
val Vector4d.zywz: Vector4d get() = Vector4d(z, y, w, z)
val Vector4d.zyww: Vector4d get() = Vector4d(z, y, w, w)
val Vector4d.zzxx: Vector4d get() = Vector4d(z, z, x, x)
val Vector4d.zzxy: Vector4d get() = Vector4d(z, z, x, y)
val Vector4d.zzxz: Vector4d get() = Vector4d(z, z, x, z)
val Vector4d.zzxw: Vector4d get() = Vector4d(z, z, x, w)
val Vector4d.zzyx: Vector4d get() = Vector4d(z, z, y, x)
val Vector4d.zzyy: Vector4d get() = Vector4d(z, z, y, y)
val Vector4d.zzyz: Vector4d get() = Vector4d(z, z, y, z)
val Vector4d.zzyw: Vector4d get() = Vector4d(z, z, y, w)
val Vector4d.zzzx: Vector4d get() = Vector4d(z, z, z, x)
val Vector4d.zzzy: Vector4d get() = Vector4d(z, z, z, y)
val Vector4d.zzzz: Vector4d get() = Vector4d(z, z, z, z)
val Vector4d.zzzw: Vector4d get() = Vector4d(z, z, z, w)
val Vector4d.zzwx: Vector4d get() = Vector4d(z, z, w, x)
val Vector4d.zzwy: Vector4d get() = Vector4d(z, z, w, y)
val Vector4d.zzwz: Vector4d get() = Vector4d(z, z, w, z)
val Vector4d.zzww: Vector4d get() = Vector4d(z, z, w, w)
val Vector4d.zwxx: Vector4d get() = Vector4d(z, w, x, x)
val Vector4d.zwxy: Vector4d get() = Vector4d(z, w, x, y)
val Vector4d.zwxz: Vector4d get() = Vector4d(z, w, x, z)
val Vector4d.zwxw: Vector4d get() = Vector4d(z, w, x, w)
val Vector4d.zwyx: Vector4d get() = Vector4d(z, w, y, x)
val Vector4d.zwyy: Vector4d get() = Vector4d(z, w, y, y)
val Vector4d.zwyz: Vector4d get() = Vector4d(z, w, y, z)
val Vector4d.zwyw: Vector4d get() = Vector4d(z, w, y, w)
val Vector4d.zwzx: Vector4d get() = Vector4d(z, w, z, x)
val Vector4d.zwzy: Vector4d get() = Vector4d(z, w, z, y)
val Vector4d.zwzz: Vector4d get() = Vector4d(z, w, z, z)
val Vector4d.zwzw: Vector4d get() = Vector4d(z, w, z, w)
val Vector4d.zwwx: Vector4d get() = Vector4d(z, w, w, x)
val Vector4d.zwwy: Vector4d get() = Vector4d(z, w, w, y)
val Vector4d.zwwz: Vector4d get() = Vector4d(z, w, w, z)
val Vector4d.zwww: Vector4d get() = Vector4d(z, w, w, w)
val Vector4d.wxxx: Vector4d get() = Vector4d(w, x, x, x)
val Vector4d.wxxy: Vector4d get() = Vector4d(w, x, x, y)
val Vector4d.wxxz: Vector4d get() = Vector4d(w, x, x, z)
val Vector4d.wxxw: Vector4d get() = Vector4d(w, x, x, w)
val Vector4d.wxyx: Vector4d get() = Vector4d(w, x, y, x)
val Vector4d.wxyy: Vector4d get() = Vector4d(w, x, y, y)
val Vector4d.wxyz: Vector4d get() = Vector4d(w, x, y, z)
val Vector4d.wxyw: Vector4d get() = Vector4d(w, x, y, w)
val Vector4d.wxzx: Vector4d get() = Vector4d(w, x, z, x)
val Vector4d.wxzy: Vector4d get() = Vector4d(w, x, z, y)
val Vector4d.wxzz: Vector4d get() = Vector4d(w, x, z, z)
val Vector4d.wxzw: Vector4d get() = Vector4d(w, x, z, w)
val Vector4d.wxwx: Vector4d get() = Vector4d(w, x, w, x)
val Vector4d.wxwy: Vector4d get() = Vector4d(w, x, w, y)
val Vector4d.wxwz: Vector4d get() = Vector4d(w, x, w, z)
val Vector4d.wxww: Vector4d get() = Vector4d(w, x, w, w)
val Vector4d.wyxx: Vector4d get() = Vector4d(w, y, x, x)
val Vector4d.wyxy: Vector4d get() = Vector4d(w, y, x, y)
val Vector4d.wyxz: Vector4d get() = Vector4d(w, y, x, z)
val Vector4d.wyxw: Vector4d get() = Vector4d(w, y, x, w)
val Vector4d.wyyx: Vector4d get() = Vector4d(w, y, y, x)
val Vector4d.wyyy: Vector4d get() = Vector4d(w, y, y, y)
val Vector4d.wyyz: Vector4d get() = Vector4d(w, y, y, z)
val Vector4d.wyyw: Vector4d get() = Vector4d(w, y, y, w)
val Vector4d.wyzx: Vector4d get() = Vector4d(w, y, z, x)
val Vector4d.wyzy: Vector4d get() = Vector4d(w, y, z, y)
val Vector4d.wyzz: Vector4d get() = Vector4d(w, y, z, z)
val Vector4d.wyzw: Vector4d get() = Vector4d(w, y, z, w)
val Vector4d.wywx: Vector4d get() = Vector4d(w, y, w, x)
val Vector4d.wywy: Vector4d get() = Vector4d(w, y, w, y)
val Vector4d.wywz: Vector4d get() = Vector4d(w, y, w, z)
val Vector4d.wyww: Vector4d get() = Vector4d(w, y, w, w)
val Vector4d.wzxx: Vector4d get() = Vector4d(w, z, x, x)
val Vector4d.wzxy: Vector4d get() = Vector4d(w, z, x, y)
val Vector4d.wzxz: Vector4d get() = Vector4d(w, z, x, z)
val Vector4d.wzxw: Vector4d get() = Vector4d(w, z, x, w)
val Vector4d.wzyx: Vector4d get() = Vector4d(w, z, y, x)
val Vector4d.wzyy: Vector4d get() = Vector4d(w, z, y, y)
val Vector4d.wzyz: Vector4d get() = Vector4d(w, z, y, z)
val Vector4d.wzyw: Vector4d get() = Vector4d(w, z, y, w)
val Vector4d.wzzx: Vector4d get() = Vector4d(w, z, z, x)
val Vector4d.wzzy: Vector4d get() = Vector4d(w, z, z, y)
val Vector4d.wzzz: Vector4d get() = Vector4d(w, z, z, z)
val Vector4d.wzzw: Vector4d get() = Vector4d(w, z, z, w)
val Vector4d.wzwx: Vector4d get() = Vector4d(w, z, w, x)
val Vector4d.wzwy: Vector4d get() = Vector4d(w, z, w, y)
val Vector4d.wzwz: Vector4d get() = Vector4d(w, z, w, z)
val Vector4d.wzww: Vector4d get() = Vector4d(w, z, w, w)
val Vector4d.wwxx: Vector4d get() = Vector4d(w, w, x, x)
val Vector4d.wwxy: Vector4d get() = Vector4d(w, w, x, y)
val Vector4d.wwxz: Vector4d get() = Vector4d(w, w, x, z)
val Vector4d.wwxw: Vector4d get() = Vector4d(w, w, x, w)
val Vector4d.wwyx: Vector4d get() = Vector4d(w, w, y, x)
val Vector4d.wwyy: Vector4d get() = Vector4d(w, w, y, y)
val Vector4d.wwyz: Vector4d get() = Vector4d(w, w, y, z)
val Vector4d.wwyw: Vector4d get() = Vector4d(w, w, y, w)
val Vector4d.wwzx: Vector4d get() = Vector4d(w, w, z, x)
val Vector4d.wwzy: Vector4d get() = Vector4d(w, w, z, y)
val Vector4d.wwzz: Vector4d get() = Vector4d(w, w, z, z)
val Vector4d.wwzw: Vector4d get() = Vector4d(w, w, z, w)
val Vector4d.wwwx: Vector4d get() = Vector4d(w, w, w, x)
val Vector4d.wwwy: Vector4d get() = Vector4d(w, w, w, y)
val Vector4d.wwwz: Vector4d get() = Vector4d(w, w, w, z)
val Vector4d.wwww: Vector4d get() = Vector4d(w, w, w, w)