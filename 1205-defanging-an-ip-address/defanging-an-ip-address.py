class Solution:
    def defangIPaddr(self, address: str) -> str:
        length = len(address)
        i = 0

        while i < length:
            if address[i] == ".":
                address = address[0:i] + "[.]" + address[i+1:]
                i += 3
                length += 2
            else:
                i += 1
        return address