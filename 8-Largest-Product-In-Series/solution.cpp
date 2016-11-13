#include <iostream>
#include <vector>
#include <string>

using namespace std;

int main(int argc, char **argv) {

	int T, K, N;
	string num;
	cin >> T;
	while (T-- > 0) {
		cin >> N;
		cin >> K;
		cin >> num;
		int result = 0;
		for (int i = 0; i < N-K+1; ++i) {
			int localResult = 1;
			for (int j = 0; j < K; ++j) {
				localResult *= num[i+j] - '0';
			}
			if (localResult > result)
				result = localResult;
		}
		cout << result << endl;
	}

	return 0;
}
